public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Fazendo miau miau miau!");
    }
    
    public void arranhar(){
        System.out.println("Arranhando as paredes!");
    }
    
    /* public static void main(String[] args){
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranhar();
    } */ 
}