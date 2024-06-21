import java.util.Scanner;

public class Cliente
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nomeCliente = "Kyko Chaves";
		String tipoDeConta = "Poupança";
		double saldo = 1000;
		double receberValor;
		double transferirValor;
		
		System.out.println("*****************************************");
		System.out.println("Dados Iniciais do Cliente: ");
		System.out.println("Nome: " + nomeCliente);
		System.out.println("Tipo de conta: " + tipoDeConta);
		System.out.println("Saldo: " + saldo);
		System.out.println("*****************************************\n\n");
		
		System.out.println("Operações\n1)Consultar Saldos\n2)Receber Valor\n3)Transferir Valor\n4)Sair\n");
		
		int respostaCondicional = scanner.nextInt();
		while(respostaCondicional != 4){
    	    switch(respostaCondicional){
        	    case 1:
        	        System.out.println("Saldo: " + saldo + "\n");
        	        System.out.println("Operações\n1)Consultar Saldos\n2)Receber Valor\n3)Transferir Valor\n4)Sair\n");
        	        respostaCondicional = scanner.nextInt();
        	        break;
        	        
        	    case 2:
        	        System.out.println("Quanto deseja depositar para sua conta: ");
        	        receberValor = scanner.nextDouble();
        	        saldo = saldo + receberValor;
        	        System.out.println("Seu novo saldo é: " + saldo + "\n");
        	        System.out.println("Operações\n1)Consultar Saldos\n2)Receber Valor\n3)Transferir Valor\n4)Sair\n");
        	        respostaCondicional = scanner.nextInt();
        	        break;
        	            
        	    case 3:
        	        System.out.println("Quanto deseja transferir de sua conta: ");
        	        transferirValor = scanner.nextDouble();
        	        
        	        if(saldo >= transferirValor){
        	            saldo = saldo - transferirValor;
        	            System.out.println("Seu novo saldo é: " + saldo + "\n");
        	        } else {
        	            System.out.println("Não é possível realizar essa operação bancária: SALDO INSUFICIENTE! \n");
        	        }
        	        
        	        System.out.println("Operações\n1)Consultar Saldos\n2)Receber Valor\n3)Transferir Valor\n4)Sair\n");
        	        respostaCondicional = scanner.nextInt();
        	        break;

                default:
        	       System.out.println("Opção inválida, tente novamente\n");
        	       System.out.println("Operações\n1)Consultar Saldos\n2)Receber Valor\n3)Transferir Valor\n4)Sair\n");
        	       respostaCondicional = scanner.nextInt();
        	       break;
        	}
		}
	}
}
