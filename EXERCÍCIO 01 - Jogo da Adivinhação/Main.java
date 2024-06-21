import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int numeroCorreto = new Random().nextInt(5);
      int tentativas = 0;
      System.out.println("Jogo da Adivinhação: chute um número entre 0 a 5 e tente a sorte");
      
      while(tentativas < 5){
          System.out.println("Digite um número: ");
          int chute = scanner.nextInt();
          tentativas = tentativas + 1;
          
          if(chute == numeroCorreto){
              System.out.println("Parabéns, você acertou com " + tentativas + " tentativas!");
              break;
          } else if(chute > numeroCorreto) {
              System.out.println("O número é menor...");
          } else {
              System.out.println("O número é maior ...");
          }
          
          if(tentativas == 4){
              System.out.println("Última tentativa...");
          } else if(tentativas > 4){
              System.out.println("Fim do jogo, o número correto era: " + numeroCorreto);
          } else {
              System.out.println("Tente novamente ...");
          }
      }
      
      
    }
}