public class Maindofilme {
    
    public static void main (String[] args){
        Filme novoFilme = new Filme();
        novoFilme.nome = "Top Gun";
        novoFilme.anoDeLancamento = 2020;
        novoFilme.duracaoEmMinutos = 180;
        novoFilme.incluidoNoPlano = true;
        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(9);
        novoFilme.avalia(8);
        novoFilme.avalia(10);
        System.out.println(novoFilme.pegaMedia());
    }
}