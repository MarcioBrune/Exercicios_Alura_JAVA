public class ContaBancaria
{
	//atributos
	private int numeroConta; 
	private double saldo;
	public String titular;
	
	// Métodos getters e setters para os atributos privados.
	public int getNumeroConta(){
	    return numeroConta;
	}
	
	public double getSaldo(){
	    return saldo;
	}
	
	public void setNumeroConta(int numeroConta ){
	    this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo ){
	    this.saldo = saldo;
	}
}
