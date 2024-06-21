//Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. 
//Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Carro{
    //atributos
    private String nomeModelo;
    private double precoMedioAnualUm;
    private double precoMedioAnualDois;
    private double precoMedioAnualTres;
    //getters
    public String getNomeModelo(){
        return nomeModelo;
    }
    
    public double getPrecoMedioAnualUm(){
        return precoMedioAnualUm;
    }
    
    public double getPrecoMedioAnualDois(){
        return precoMedioAnualDois;
    }
    
    public double getPrecoMedioAnualTres(){
        return precoMedioAnualTres;
    }
    
    //setters
    public void setNomeModelo(String nomeModelo){
        this.nomeModelo = nomeModelo;
    }
    
    public void setPrecoMedioAnual(double precoMedioAnualUm, double precoMedioAnualDois, double precoMedioAnualTres){
        this.precoMedioAnualUm = precoMedioAnualUm;
        this.precoMedioAnualDois = precoMedioAnualDois;
        this.precoMedioAnualTres = precoMedioAnualTres;
    }
    
    
    //métodos
    public void menorMaiorPreco(){
        double maior = 0;
        double menor = 0;
        if(precoMedioAnualUm > precoMedioAnualDois && precoMedioAnualUm > precoMedioAnualTres){
            maior = precoMedioAnualUm;
            if(precoMedioAnualDois > precoMedioAnualTres){
                menor = precoMedioAnualTres;
            } else {
                menor = precoMedioAnualDois;
            }
        } else if(precoMedioAnualDois > precoMedioAnualUm && precoMedioAnualDois > precoMedioAnualTres){
            maior = precoMedioAnualDois;
            if(precoMedioAnualUm > precoMedioAnualTres){
                menor = precoMedioAnualTres;
            } else {
                menor = precoMedioAnualUm;
            }
        } else if (precoMedioAnualTres > precoMedioAnualUm && precoMedioAnualTres > precoMedioAnualDois){
            maior = precoMedioAnualTres;
            if(precoMedioAnualUm > precoMedioAnualDois){
                menor = precoMedioAnualDois;
            } else {
                menor = precoMedioAnualUm;
            }
        }
        System.out.println("O maior valor médio foi de: " + maior);
        System.out.println("O menor valor médio foi de: " + menor);
        
    }
    
    public void exibirInfo() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preço Ano 1: " + precoMedioAnualUm);
        System.out.println("Preço Ano 2: " + precoMedioAnualDois);
        System.out.println("Preço Ano 3: " + precoMedioAnualTres);
        menorMaiorPreco();
    }

}