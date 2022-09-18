package cursojava.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartternMatcherTest05 {
    public static void main(String[] args) {
        // \d= todos os digitos
        // \D = Tudo o que não é digito
        // \s = Esxpaços em Branco \t \n \f /r
        // \w = a-zA -Z, digitos, _
        // \W = Tudo o que não for incluso n \w
        // []
        // ? = Zero pu uma
        // * = zero ou mais
        // + = uma ou mais
        //{n,m}=  de n ate m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3

        String regx = "([a-z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "luffy2hotmail.com, 123@jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("email valido");
        System.out.println("#@!zoro@mail.br".matches(regx));
        System.out.println(texto.split(",")[1].trim());
        Pattern patern = Pattern.compile(regx);
        Matcher matcher = patern.matcher(texto);
        System.out.println("Texto:  "+ texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+ regx);
        System.out.println("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }

    }
}
