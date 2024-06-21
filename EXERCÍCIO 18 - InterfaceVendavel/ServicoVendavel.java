public class ServicoVendavel implements Vendavel{
    public void calcularPreco(double preco, int quantidade, double desconto){
        double valor = (preco * quantidade) - (desconto/100);
        System.out.println("O valor final do serviço é: " + valor);
    }
}