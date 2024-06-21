/*Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/

import java.util.ArrayList;
import java.util.Collections;

public class NumeroLista{
    public static void main(String[] args){
        ArrayList<Integer> listaNum = new ArrayList<>();
        listaNum.add(5);
        listaNum.add(1);
        listaNum.add(7);
        listaNum.add(2);
        listaNum.add(0);
        listaNum.add(3);
        System.out.println("Lista de números desordenada: " + listaNum);
        Collections.sort(listaNum);
        //Depois da execução do método acima, a lista está ordenada
        System.out.println("Lista de números ordenada: " + listaNum);
    }
}