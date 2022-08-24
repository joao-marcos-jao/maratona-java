package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoas;

public class PessoaTest01 {
    public static void main(String[] args){
        Pessoas pessoas = new Pessoas();
        pessoas.setNome("Jiraya");
        pessoas.setIdade(70);

        System.out.println(pessoas.getNome());
        System.out.println(pessoas.getIdade());

    }

}
