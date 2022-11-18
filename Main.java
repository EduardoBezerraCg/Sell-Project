public class Main {

    public static void main(String[] args) {



        String userInputProduto = "maca";
        int userInputNIF = 100200300;
        double userInputValor = 1.52;
        double desconto = -0.50;


        Venda primeiraVenda = new Venda(userInputProduto, userInputNIF, userInputValor);
        Venda segundaVenda = new Venda(userInputProduto, userInputNIF, userInputValor + desconto);


        Venda terceiraVenda = new Venda("Pera", 200200200, 1.50);
        Venda quartaVenda = new Venda("maca", 500500500, 1.55);


        Venda.vendas.add(primeiraVenda);
        Venda.vendas.add(segundaVenda);
        Venda.vendas.add(terceiraVenda);
        Venda.vendas.add(quartaVenda);

        System.out.println(Venda.GetMediaVendas());

    }
}