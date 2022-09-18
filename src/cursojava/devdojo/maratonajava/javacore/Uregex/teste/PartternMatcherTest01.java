package cursojava.devdojo.maratonajava.javacore.Uregex.teste;

import cursojava.devdojo.maratonajava.javacore.Qstring.test.StringBuilderTest01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartternMatcherTest01 {
    public static void main(String[] args) {
        String regx = "aba";
       // String texto = "abaaba";
        String texto2 = "abababa";
        Pattern patern = Pattern.compile(regx);
        Matcher matcher = patern.matcher(texto2);
        System.out.println("Texto:  "+ texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+ regx);
        System.out.println("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }

    }
}
