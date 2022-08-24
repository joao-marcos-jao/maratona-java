package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cauculadora;

public class CauculadoraTest04 {
    public static void main(String[] args){
        Cauculadora cauculadora = new Cauculadora();
        int num1 = 1;
        int num2 = 2;
        cauculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CauculadoraTest04");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
