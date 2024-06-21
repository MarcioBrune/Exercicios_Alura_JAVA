import java.util.Scanner;

public class Main {
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0){
            System.out.println("Número positivo");
        } else{
            System.out.println("Número negativo");
        }
        // Exercício 1
        
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números inteiros a seguir ...");
        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();
        
        if (numeroUm != numeroDois){
            if(numeroUm > numeroDois){
                System.out.println("O número " + numeroUm + " é maior que o " + numeroDois);
            } else {
                System.out.println("O número " + numeroDois + " é maior que o " + numeroUm);
            }
        } else {
            System.out.println("Os números são iguais!");
        } */

        // Exercício 2
        
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha: \n 1. Calcular área do quadrado \n 2. Calcular área do círculo");
        int escolhaNum = scanner.nextInt();
        switch (escolhaNum){
            case 1:
                System.out.println("Digite o valor do lado do quadrado");
                int lado = scanner.nextInt();
                int resultadoQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + resultadoQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo");
                int raio = scanner.nextInt();
                int resultadoCirculo = 3 * raio * raio;
                System.out.println("A área do círculo é: " + resultadoCirculo);
                break;
            default:
                System.out.println("Escolha entre as opções 1 e 2. Tente novamente.");
                break;
        } */ // Exercício 3
        
        
        
    }
}