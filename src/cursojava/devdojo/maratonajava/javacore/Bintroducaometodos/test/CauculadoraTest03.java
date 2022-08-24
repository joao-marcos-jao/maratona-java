package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cauculadora;

public class CauculadoraTest03 {
    public static void main(String[] args) {
        Cauculadora cauculadora = new Cauculadora();
       double result =  cauculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(cauculadora.divideDoisNumeros2(20,0));
        System.out.println("---------------");
        cauculadora.i(80,0);

    }
}
