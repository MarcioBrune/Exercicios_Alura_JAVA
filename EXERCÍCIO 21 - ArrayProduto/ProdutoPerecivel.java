public class ProdutoPerecivel extends Produto{
    private String dataValidade;
    
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    
    public static void main(String[] args){
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Café", 17, 2, "20-03-2025");
        System.out.println(produtoPerecivel);
        
    }
}