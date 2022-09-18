package cursojava.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartternMatcherTest03 {
    public static void main(String[] args) {
        // \d= todos os digitos
        // \D = Tudo o que não é digito
        // \s = Esxpaços em Branco \t \n \f /r
        // \w = a-zA -Z, digitos, _
        // \W = Tudo o que não for incluso n \w
        // []
        String regx = "0[Xx][0-9a-fA-F]";
       // String texto = "abaaba";
        String texto2 = "12 0x 0X 0XFFABC 0x109 0x1";
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
