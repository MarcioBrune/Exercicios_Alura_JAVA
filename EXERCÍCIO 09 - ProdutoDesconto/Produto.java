public class Produto{
    //atributos
    private String nome;
    private double preco;
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void aplicarDesconto(double valor){
        if(valor > 100){
            System.out.println("Não é possível aplicar desconto");
        } else if(valor < 0){
            System.out.println("Não é possível aplicar desconto");
        } else{
            preco = preco - ((preco * valor)/100);
            System.out.println("O novo valor com o desconto é: " + String.format("%.2f", preco));
        }
    }    
}
