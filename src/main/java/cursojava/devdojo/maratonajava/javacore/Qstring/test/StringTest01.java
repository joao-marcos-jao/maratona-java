package cursojava.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Joao"; // String constant pool
        String nome2 = "Joao";
        nome = nome.concat(" Marcos");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String ("Joao");
        System.out.println(nome2 == nome3);// 1 variavel de referencia, 2 objeto do tipo String, 3 uma String no pol de String
        System.out.println(nome2 == nome3.intern());

    }
}
