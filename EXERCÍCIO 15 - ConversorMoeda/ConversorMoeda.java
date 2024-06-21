public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorDolar) {
        //double cotacaoDolar = 4.80;
        double valorReal = valorDolar * 4.8;
        return valorReal;
        //System.out.println("O valor em reais é: R$" + valorReal);
    }
    
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println(conversor.converterDolarParaReal(50)); // Exemplo com o valor em dólar
    }
}