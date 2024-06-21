public class PrincipalProdutoServico{
    public static void main(String[] args){
        //Construtor
        ServicoVendavel servico = new ServicoVendavel();
        ProdutoVendavel produto = new ProdutoVendavel();
        
        servico.calcularPreco(12.5,2,5);
        produto.calcularPreco(100,1,30);
    }
}