package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LigthNovel> ligthNovels =new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Over Lord", 3.99),
            new LigthNovel("Violet evergarden",5.99),
            new LigthNovel("No Game no life",2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Monogatari",4.00)
    ));
    public static void main(String[] args) {
        Stream<LigthNovel> stream = ligthNovels.stream();
        ligthNovels.forEach(System.out::println);
        long count = stream.
                distinct().
                filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);


    }
}
