public class ProdutoFisico implements Calculavel{
    //atributos
    private double preco;
    private double desconto;
    
    //get e set
    public double getPreco(){
        return preco;
    }
    
    public double getDesconto(){
        return desconto;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }    
    
    //método
    public double calcularPrecoFinal(){
        return preco - desconto;
    }
}