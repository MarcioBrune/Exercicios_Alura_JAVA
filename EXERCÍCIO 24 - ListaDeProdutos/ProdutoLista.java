/******************************************************************************
Crie uma classe Produto com propriedades como nome e preço. 
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

*******************************************************************************/

import java.util.ArrayList;
public class ProdutoLista{
    //atributo
    private String nome;
    private double preco;
    
    
    //construtotr
    public ProdutoLista (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public static void main(String[] args){
        double soma = 0;
        int quantidade = 0;
        double media;
        
        ProdutoLista produtoUm = new ProdutoLista("Coca-cola",11.5);
        ProdutoLista produtoDois = new ProdutoLista("Pepsi", 9.5);
        ProdutoLista produtoTres = new ProdutoLista("Fanta", 6.0);
        
        ArrayList<ProdutoLista> lista = new ArrayList<>();
        lista.add(produtoUm);
        lista.add(produtoDois);
        lista.add(produtoTres);
        
        
        for(int i = 0; i < lista.size(); i++){
            quantidade = quantidade + i;
            soma = soma + (double) lista.get(i).getPreco();
            media = soma/quantidade;
            if(i == lista.size() - 1){
                System.out.println("O preço médio dos produtos é: " + media);    
            }
            
        }
        
    }
}