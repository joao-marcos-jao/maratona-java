package cursojava.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RumtimeExceptionTest02 {
    public static void main(String[] args) {
            divisao(1, 0);
        System.out.println("codigo finalizado");
    }
    private static int divisao(int a, int b)  {
        if (b == 0) {
            throw new IllegalArgumentException ("Argumeento inlegal, não pode ser 0 ");
        }
        return a / b;
    }
}
