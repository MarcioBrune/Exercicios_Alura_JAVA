public class MainAnimalDois {
    public static void main(String[] args) {
        AnimalDois animalDois = new CachorroDois();

        if (animalDois instanceof CachorroDois) {
            CachorroDois cachorro = (CachorroDois) animalDois;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}