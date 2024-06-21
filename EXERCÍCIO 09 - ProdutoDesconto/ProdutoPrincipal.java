public class ProdutoPrincipal{
    public static void main(String[] args){
        Produto produto = new Produto();
        
        produto.setNome("Coca-cola");
        produto.setPreco(9.5);
        
        produto.aplicarDesconto(80);
    }
}