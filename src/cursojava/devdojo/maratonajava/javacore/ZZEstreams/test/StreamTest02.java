package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LigthNovel> ligthNovels =new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Over Lord", 3.99),
            new LigthNovel("Violet evergarden",5.99),
            new LigthNovel("No Game no life",2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Monogatari",4.00)
    ));
    public static void main(String[] args) {
        List<String> titles = ligthNovels.stream()
                .sorted(Comparator.comparing(LigthNovel::getTitle))
                .filter(ln -> ln.getPrice() <=4)
                .limit(3)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);


    }
}
