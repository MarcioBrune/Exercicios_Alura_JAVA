public class ContaCorrente extends ContaBancaria{
    //métodos
    public double cobrarTarifaMensal(double tarifa){
        saldo = saldo - tarifa;
        return saldo;
    }
    
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.saldo = 1000;
        contaCorrente.sacar(100);
        contaCorrente.depositar(30);
        contaCorrente.cobrarTarifaMensal(7);
        contaCorrente.consultarSaldo();
    }
}