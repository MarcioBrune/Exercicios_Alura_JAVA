/* Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. 
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.*/

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

//Não precisa colocar implements List!!
public class TestandoListas {
    public static void main(String[] args){
        List<String> listaArray = new ArrayList<>();
        listaArray.add("A");
        listaArray.add("B");
        System.out.println(listaArray);
        
        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("C");
        listaLinked.add("D");
        System.out.println(listaLinked);
        
    }
}
