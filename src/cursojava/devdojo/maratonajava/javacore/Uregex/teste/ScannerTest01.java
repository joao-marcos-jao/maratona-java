package cursojava.devdojo.maratonajava.javacore.Uregex.teste;

import cursojava.devdojo.maratonajava.javacore.Qstring.test.StringBuilderTest01;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
            
        }

    }
}
