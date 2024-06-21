/* Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo. */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

//Não precisa colocar implements List!!
public class TestandoListasDois {
    public static void main(String[] args){
        //declaração da variável listaPolimorfica com tipo List<String>
        List<String> listaPolimorfica;

        //instanciando um objeto com o construtor ArrayList
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        //instanciando um objeto com o construtor LinkedList
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
