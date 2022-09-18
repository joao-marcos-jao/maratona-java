package cursojava.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartternMatcherTest02 {
    public static void main(String[] args) {
        // \d= todos os digitos
        // \D = Tudo o que não é digito
        // \s = Esxpaços em Branco \t \n \f /r
        // \w = a-zA -Z, digitos, _
        // \W = Tudo o que não for incluso n \w
        String regx = "\\W";
       // String texto = "abaaba";
        String texto2 = "@#hh_j2 12gvh21";
        Pattern patern = Pattern.compile(regx);
        Matcher matcher = patern.matcher(texto2);
        System.out.println("Texto:  "+ texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+ regx);
        System.out.println("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }

    }
}
