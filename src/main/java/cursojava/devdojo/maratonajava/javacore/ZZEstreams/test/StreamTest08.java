package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LigthNovel> ligthNovels =new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Over Lord", 10.99),
            new LigthNovel("Violet evergarden",5.99),
            new LigthNovel("No Game no life",2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Monogatari",4.00)
    ));

    public static void main(String[] args) {
      /*  ligthNovels.stream()
                .map(LigthNovel::getPrice)
                .filter(price-> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
      */

        double sum = ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice)
                .filter(price-> price > 3)
                .sum();
        System.out.println(sum);
    }
}
