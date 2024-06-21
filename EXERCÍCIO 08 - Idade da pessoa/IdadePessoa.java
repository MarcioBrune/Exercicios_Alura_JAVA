public class IdadePessoa{
    //atributos
    private String nome;
    private int idade;
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    //verificarIdade
    
    public void verificarIdade(){
        if (idade > 18){
            System.out.println("Você é maior de idade");
        } else{
            System.out.println("Você não é maior de idade");
        }
    }
}
