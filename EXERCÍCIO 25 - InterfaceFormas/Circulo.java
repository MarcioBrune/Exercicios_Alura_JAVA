/******************************************************************************

Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. 
Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.

*******************************************************************************/

public class Circulo implements Forma{
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    @Override
	public double calcularArea(){
	    double pi = 3.14;
        double resultado = raio * raio * pi;
        return resultado;
    }
}
