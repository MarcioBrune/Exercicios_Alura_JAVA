public class Livro{
    //atributos
    private String titulo;
    private String autor;
    
    //getters
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    //método
    public void exibirDetalhes(){
        System.out.println(titulo);
        System.out.println(autor);
    }
}