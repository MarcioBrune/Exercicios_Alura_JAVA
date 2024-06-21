/* Crie uma classe Titulo com um atributo nome do tipo String. OK
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo. OK
No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. OK
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.*/

import java.util.ArrayList;
import java.util.Collections;

//Não precisa importar o java.util da implementação abaixo 
public class TituloLivro implements Comparable<TituloLivro>{
    //atributo
    private String nome;
    
    public TituloLivro(String nome){
        this.nome = nome;
    }
    
//Sobrescrever o método de compareTo
    @Override
    public int compareTo(TituloLivro outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
    public static void main(String[] args){
        TituloLivro livroUm = new TituloLivro("Harry Potter");
        TituloLivro livroDois = new TituloLivro("Crepúsculo");
        TituloLivro livroTres = new TituloLivro("Amazing Spider-man");
        
        ArrayList<TituloLivro> tituloLista = new ArrayList<>();
        tituloLista.add(livroUm);
        tituloLista.add(livroDois);
        tituloLista.add(livroTres);
        
        System.out.println("Lista desordenada: " + tituloLista);
        Collections.sort(tituloLista);
        System.out.println("Lista ordenada: " + tituloLista);
    }
}