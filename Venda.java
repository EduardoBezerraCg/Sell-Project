import java.util.ArrayList;

public class Venda {



    String produto;
    int NIF;
    double valor;
    String status;
    public static ArrayList<Venda> vendas = new ArrayList<Venda>();

    public static boolean VendaValid(String produto, int NIF, double valor){
        if (valor >= 0 && NIF > 100000000 && NIF < 999999999 && produto.length() > 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double GetMediaVendas(){

        double valorTotal = 0;

        for (int i = 0; i < vendas.size(); i ++)
        {
            valorTotal += vendas.get(i).valor;
        }
        return valorTotal / vendas.size();

    }

    public static Venda RetornarVendaMaior(Venda primeiraVenda, Venda segundaVenda){
        if (primeiraVenda.valor > segundaVenda.valor)
        {
            return primeiraVenda;
        }
        else if (primeiraVenda.valor == segundaVenda.valor)
        {
            System.out.println("Warning");
            return primeiraVenda;
        }
        else
        {
            return segundaVenda;
        }
    }


    public Venda(String produto, int NIF, double valor){

        if (VendaValid(produto, NIF, valor))
        {
            this.produto = produto;
            this.NIF = NIF;
            this.valor = valor;
            System.out.println("Nova venda criada");
        }
        else
        {
            System.out.println("Aviso, Valores náo validos");
        }

    }

}
