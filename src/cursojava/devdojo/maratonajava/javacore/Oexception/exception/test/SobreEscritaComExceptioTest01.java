package cursojava.devdojo.maratonajava.javacore.Oexception.exception.test;

import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobreEscritaComExceptioTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        pessoa.salvar();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
