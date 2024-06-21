/******************************************************************************

Crie uma classe ContaBancariaDois com propriedades como número da conta e saldo. 
Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

*******************************************************************************/
import java.util.ArrayList;

public class ContaBancariaDois{
	private int numeroConta;
	double saldo;
	
	public ContaBancariaDois (int numeroConta, double saldo){
	    this.numeroConta = numeroConta;
	    this.saldo = saldo;
	}
	
	@Override
	public String toString(){
	    return "O número da conta é: " + numeroConta + " e seu saldo é: " + saldo;
	}
	
	public static void main(String[] args){
	    ContaBancariaDois contaUm = new ContaBancariaDois(1, 1200);
	    ContaBancariaDois contaDois = new ContaBancariaDois(2, 2550.50);
	    ContaBancariaDois contaTres = new ContaBancariaDois(3, 700);
	    ContaBancariaDois contaQuatro = new ContaBancariaDois(4, 500);
	    ContaBancariaDois contaCinco = new ContaBancariaDois(5, 8100);
	    ContaBancariaDois contaSeis = new ContaBancariaDois(6, 1700);
	    
	    ArrayList<ContaBancariaDois> lista = new ArrayList<>();
	    lista.add(contaUm);
	    lista.add(contaDois);
	    lista.add(contaTres);
	    lista.add(contaQuatro);
	    lista.add(contaCinco);
	    lista.add(contaSeis);
	    double maior = lista.get(0).saldo;
	    
	    for(ContaBancariaDois elemento : lista){
	        //System.out.println(elemento);
	        
	        if(elemento.saldo > maior){
	            maior = elemento.saldo;
	            System.out.println("O maior saldo é: " + elemento.saldo);
	        } else{
	            maior = maior;
	            System.out.println("O maior saldo é: " + maior);
	        }
	    }
	}
}
