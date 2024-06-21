public class Filme
{
	// Atributos
	String nome; 
	int anoDeLancamento; 
	int duracaoEmMinutos;
	boolean incluidoNoPlano; 
	double somaDasAvaliacoes; 
	double totalDeAvaliacoes; 
	
	//métodos 
	void exibeFichaTecnica() {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    } 
	
	void avalia (double nota) {
	    somaDasAvaliacoes = somaDasAvaliacoes + nota;
	    totalDeAvaliacoes = totalDeAvaliacoes + 1;
	}
	double pegaMedia(){
	    return somaDasAvaliacoes / totalDeAvaliacoes ;
	}
}
