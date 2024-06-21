import java.util.ArrayList;

//Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
public class PercorrerLista{
    //atributos
    private String nomeDesenho;
    
    //construtor
    public PercorrerLista(String nomeDesenho){
        this.nomeDesenho = nomeDesenho;
    }
    
    @Override
    public String toString(){
        return nomeDesenho;
    }
    
    
    public static void main(String[] args){
        PercorrerLista nomeZero = new PercorrerLista("Dragon Ball");
        PercorrerLista nomeUm = new PercorrerLista("Dragon Ball Z");
        PercorrerLista nomeDois = new PercorrerLista("Dragon Ball GT");
        
        ArrayList<PercorrerLista> lista = new ArrayList<>();
        lista.add(nomeZero);
        lista.add(nomeUm);
        lista.add(nomeDois);
        
        for(PercorrerLista elemento : lista){
            System.out.println(elemento);
        }
        
    }
}