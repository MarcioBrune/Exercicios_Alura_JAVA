public class Quadrado implements Forma{
    private double lado;
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    @Override
    public double calcularArea(){
        double resultado = lado * lado;
        return resultado;
    }
}