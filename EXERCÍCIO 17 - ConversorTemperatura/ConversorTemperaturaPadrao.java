//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). 
//Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    public void celsiusParaFahrenheit(double valor){
         double fahrenheit = (valor * 1.8) + 32;
         System.out.println("A conversão para fahrenheit é: "+ fahrenheit);
    }
    
    public void fahrenheitParaCelsius(double valor){
        double celsius = (valor - 32) * (5/9);
        System.out.println("A conversão para celcius é: " + celsius);
    }
    
    public static void main(String[] args){
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(100);
        conversor.fahrenheitParaCelsius(90);
    }
}