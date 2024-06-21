
public class TabuadaMultiplicacao{
    public void mostrarTabuada(int numero){
        for (int i = 0 ; i <10 ; i++ ){
            System.out.println(numero + " x " + i + " = " + numero * i);
        } 
    }
    
    public static void main(String[] args){
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);
    }
}
