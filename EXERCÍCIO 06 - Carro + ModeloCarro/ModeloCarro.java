public class ModeloCarro extends Carro {
    // atributos
    private String versao;

    // setter para a versão
    public void setVersao(String versao) {
        this.versao = versao;
    }
    //getter
    public String setVersao(){
        return versao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + getNomeModelo());
        System.out.println("Versão: " + versao);
        System.out.println("Preço Ano 1: " + getPrecoMedioAnualUm());
        System.out.println("Preço Ano 2: " + getPrecoMedioAnualDois());
        System.out.println("Preço Ano 3: " + getPrecoMedioAnualTres());
        menorMaiorPreco();
    }

    public static void main(String[] args) {
        
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setNomeModelo("Cruze");
        modeloCarro.setPrecoMedioAnual(60000, 65000, 62000); // Definindo os preços na instância de ModeloCarro
        modeloCarro.setVersao("LTZ"); // Define a versão do modelo
        modeloCarro.exibirInfo();
    }
}
