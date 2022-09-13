package cursojava.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Joao";
        nome.concat(" Marcos");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Joao");
        sb.append ("Marcos").append(" Academy").append(" DevX");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
