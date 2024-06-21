/******************************************************************************

criar uma aplicação para lançamento de compras com cartão de crédito - 
menu para lançamento das compras - 
exibição da lista de compras realizadas e ordenadas por valor -

*******************************************************************************/
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;


public class CartaoCompraTres {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    HashMap<String, Double> mapaExtrato = new HashMap<>();
	    List<HashMap<String, Integer>> lista = new ArrayList<>();
	    
	    System.out.println("Digite o limite do cartão de crédito: ");
	    double limiteCartao = scanner.nextDouble();
	    System.out.println("O que deseja fazer?\n1 - Comprar\n2 - Extrato\n0 - Sair do sistema");
	    int escolha = scanner.nextInt();
		
		while(escolha != 0){
		    if(escolha == 1){
    		    System.out.println("Produto:");
                String produto = scanner.next(); // Chama nextLine() uma vez para consumir a nova linha
                System.out.println("Valor do produto:");
                double valor = scanner.nextDouble();
                scanner.nextLine();
    		    if(limiteCartao < valor){
    		        System.out.println("Saldo indisponível");
    		        System.out.println("O que deseja fazer?\n1 - Comprar\n2 - Extrato\n0 - Sair do sistema");
	                escolha = scanner.nextInt();
    		    } else{
    		        limiteCartao = limiteCartao - valor;
    		        System.out.println("Seu saldo é: " + limiteCartao);
    		        mapaExtrato.put(produto, valor);
    		        System.out.println("O que deseja fazer?\n1 - Comprar\n2 - Extrato\n0 - Sair do sistema");
	                escolha = scanner.nextInt();
    		    }
		    } 
		    else if (escolha == 2){
		        List<Map.Entry<String, Double>> listaExtrato = new ArrayList<>(mapaExtrato.entrySet());
                Collections.sort(listaExtrato, Comparator.comparing(Map.Entry::getValue));
            
                for (Map.Entry<String, Double> entrada : listaExtrato) {
                    System.out.println("Produto: " + entrada.getKey() + " - Valor: " + entrada.getValue());
                }
            
                System.out.println("O que deseja fazer?\n1 - Comprar\n2 - Extrato\n0 - Sair do sistema");
                escolha = scanner.nextInt();
		        
		        //mapaExtrato.forEach((produto, valor) -> System.out.println("Produto: " + produto + ", Valor: " + valor  + "\n"));
		        //System.out.println("O que deseja fazer?\n1 - Comprar\n2 - Extrato\n0 - Sair do sistema");
	            //escolha = scanner.nextInt();
		    }
		    
		    else{
		        System.out.println("Opção inválida");
		        escolha = scanner.nextInt();
		    }
		}
		
	}
}
