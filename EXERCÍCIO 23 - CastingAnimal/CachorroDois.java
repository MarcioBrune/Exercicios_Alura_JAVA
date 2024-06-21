public class CachorroDois extends AnimalDois{
    private String raca;
    
    public CachorroDois(String nome, String cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public CachorroDois() {

    }

    public static void main(String[] args){
        CachorroDois cachorro = new CachorroDois("Hanna", "Caramelo", "Vira-Lata");
        AnimalDois animalDois = (AnimalDois) cachorro;
    }
}