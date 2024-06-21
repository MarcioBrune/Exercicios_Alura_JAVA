public class Calculadora{
    
    private double retornaDobro(double numero){
        return numero * 2;
    }
    
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.retornaDobro(10));
        System.out.println(calculadora.retornaDobro(3));
        System.out.println(calculadora.retornaDobro(5.7));
    }
}
