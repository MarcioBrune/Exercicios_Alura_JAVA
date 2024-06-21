public class Aluno{
    //atributos
    private String nome;
    private double nota;
    private double somaNotas;
    private int quantidadeProvas;
    private double calcularMedia;
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public double getNota(){
        return nota;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    //métodos
    public void notas(double notas){
        somaNotas = somaNotas + notas;
        quantidadeProvas = quantidadeProvas + 1;
        calcularMedia = somaNotas/quantidadeProvas;
        System.out.println("A média do aluno " + nome + " é: " + String.format("%.1f", calcularMedia));
    }
}