package cursojava.devdojo.maratonajava.javacore.Oexception.exception.test;

import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginIvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();

        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDb = "Goku";
        String senhaDb = "ssj";
        System.out.println("Usuário");
        String usernamedigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDb.equals(usernamedigitado) || !senhaDb.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Usuário Logado com sucesso");
    }
}
