package cursojava.devdojo.maratonajava.javacore.Ycolecoes.test;

import cursojava.devdojo.maratonajava.javacore.Ycolecoes.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
     /*   String nome = "Joao Marcos";
        String nome2 =new String("Joao Marcos") ;
        System.out.println(nome.equals(nome2));*/
        Smartphone s1 = new Smartphone("1ABC1","IPHONE");
        Smartphone s2 = new Smartphone("1ABC1", "IPHONE");
        System.out.println(s1.equals(s2));
    }
}
