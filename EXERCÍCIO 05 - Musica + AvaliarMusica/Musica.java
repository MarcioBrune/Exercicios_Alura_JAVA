public class Musica
{   
    //atributos
    String titulo; 
    String artista; 
    int anoLancamento;
    double avaliacao;
    double numAvaliacoes;
    
    //métodos que devem ser instanciados!
    void fichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(mediaAvaliacoes());
        System.out.println(numAvaliacoes);
    } 
    void avaliarMusica(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes = numAvaliacoes + 1;
    }
    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
    
    
	public static void main(String[] args) {
		Musica musica = new Musica();
		musica.titulo = "Melancolia";
		musica.artista = "Marcinho";
		musica.anoLancamento = 2024;
		
		musica.avaliarMusica(10);
		musica.avaliarMusica(7.8);
		musica.avaliarMusica(8.5);
		
		musica.fichaTecnica();
	}
}
