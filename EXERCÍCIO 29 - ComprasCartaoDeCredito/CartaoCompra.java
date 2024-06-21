/******************************************************************************

criar uma aplicação para lançamento de compras com cartão de crédito - 
menu para lançamento das compras - 
exibição da lista de compras realizadas e ordenadas por valor -

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class CartaoCompra {
    private String descricao;
    private double compra;
    private double limiteCartao;
    
    //métodos
    public CartaoCompra (String descricao, double compra){
        this.descricao = descricao;
        this.compra = compra;
    }
    
    
	public static void main(String[] args) {
	    ArrayList<CartaoCompraDois> listaCompras = new ArrayList();
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o limite do cartão de crédito: ");
	    double limiteCartao = scanner.nextDouble();
	    System.out.println("O que deseja fazer?\n1 - Comprar\n0 - Sair do sistema");
	    int escolha = scanner.nextInt();
		while(escolha != 0){
		    switch(escolha){
		        case 1:
		            System.out.println("Descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Valor da compra: ");
                    double compra = scanner.nextDouble();
                    scanner.nextLine();                         
		        default:
		            System.out.println("Digite uma opção válida");
	                escolha = scanner.nextInt();
		            break;
		    }
		}
	}
}
