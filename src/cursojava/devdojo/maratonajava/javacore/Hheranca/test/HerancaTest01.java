package cursojava.devdojo.maratonajava.javacore.Hheranca.test;

import cursojava.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import cursojava.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua(" Rua: Jundiai");
        endereco.setCep(" Cep: 74905-480");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome: João Marcos");
        pessoa.setCpf(" CPF: 051.237.743.-00 ");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
    }
}
