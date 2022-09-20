package cursojava.devdojo.maratonajava.javacore.Wnio.test;

import cursojava.devdojo.maratonajava.javacore.Qstring.test.StringBuilderTest01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTes01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/joao/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./joao/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());


    }
}
