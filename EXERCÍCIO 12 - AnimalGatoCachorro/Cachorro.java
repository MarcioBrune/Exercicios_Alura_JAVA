public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Fazendo au au au!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo de alegria");
    }
    
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}