import java.util.ArrayList;

public class PrincipalPessoa{
    public static void main(String[] args){
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Ivo", 67);
        Pessoa pessoa2 = new Pessoa("Teresinha", 65);
        Pessoa pessoa3 = new Pessoa("Maiara", 29);
        
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.getFirst());
        System.out.println(listaDePessoas.toString());
    }
}