//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. 
//Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class ProdutoVendavel implements Vendavel{
    public void calcularPreco(double preco, int quantidade, double desconto){
        double valor = (preco * quantidade) - desconto;
        System.out.println("O valor final é: " + valor);
    }
}
