//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). ok
public class ContaBancaria{
  //atributos
  protected double saldo;
  
  //getters
  public double getSaldo(){
      return saldo;
  }
  //setters
  public void setSaldo(double saldo){
      this.saldo = saldo;
  }
  //métodos
  public double depositar(double deposito){
      return saldo = saldo + deposito;
  }
  
  public double sacar(double sacar){
      return saldo = saldo - sacar;
  }
  
  public void consultarSaldo(){
      System.out.println("Seu saldo é: " + saldo);
  }
  
}
//Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. ok
//Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.