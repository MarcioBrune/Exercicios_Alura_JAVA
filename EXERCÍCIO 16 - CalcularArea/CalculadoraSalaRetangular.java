//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() 
//para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;
    
    @Override
    public void calcularArea(){
        double resultadoArea = altura * largura;
        System.out.println("A área da sala é: " + resultadoArea);
    }
    
    @Override
    public void calcularPerimetro(){
        double resultadoPerimetro = altura * 2 + largura * 2;
        System.out.println("O perímetro da sala é: " + resultadoPerimetro);
    }
    
    public static void main(String[] args){
        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular();
        calcular.altura = 5;
        calcular.largura = 2;
        calcular.calcularArea();
        calcular.calcularPerimetro();
    }
}