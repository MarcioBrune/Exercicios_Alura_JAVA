import java.util.Scanner;

/*public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numeroInt = scanner.nextInt();
		for(int i = 0; i < 10; i++ ){
		    System.out.println(numeroInt + " x " + i + " = " + numeroInt * i);
		}
	}
}  */

// Exercício 4

/* import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numeroInt = scanner.nextInt();
		int testePar = numeroInt%2;
		if(testePar == 0){
		    System.out.println("É um número par");
		} else{
		    System.out.println("É um número impar");
		}
	}
} */

// Exercício 5

 import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numeroInt = scanner.nextInt();
		int auxiliar = numeroInt;
		for(int i = 1; i < numeroInt; i++){
		    auxiliar = auxiliar * i;
		    //System.out.println(auxiliar);
		    //System.out.println(i);
		}
    
	    System.out.println(auxiliar);
	    
	}
}
