import java.util.ArrayList;

public class PrincipalForma{
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        
        circulo.setRaio(3);
        quadrado.setLado(4);
        
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(quadrado);
        
        for(Forma elemento: lista){
            System.out.println("Área: " + elemento.calcularArea());
        }
    }
}