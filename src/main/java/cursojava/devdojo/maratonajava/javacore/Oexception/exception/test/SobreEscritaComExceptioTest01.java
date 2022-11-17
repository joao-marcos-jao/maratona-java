package cursojava.devdojo.maratonajava.javacore.Oexception.exception.test;

import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.IOException;

public class SobreEscritaComExceptioTest01 {
    public static void main(String[] args) throws IOException, LoginInvalidoException {
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
