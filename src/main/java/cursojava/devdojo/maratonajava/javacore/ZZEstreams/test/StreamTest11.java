package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {
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
        System.out.println(ligthNovels.stream().count());
        System.out.println(ligthNovels.stream().collect(Collectors.counting()));


        ligthNovels.stream().max(Comparator.comparing(LigthNovel::getPrice)).ifPresent(System.out::println);
        ligthNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))).ifPresent(System.out::println);


        System.out.println(ligthNovels.stream().mapToDouble(LigthNovel::getPrice).sum());
        System.out.println(ligthNovels.stream().collect(Collectors.summingDouble(LigthNovel::getPrice)));

        ligthNovels.stream().mapToDouble(LigthNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(ligthNovels.stream().collect(Collectors.averagingDouble(LigthNovel::getPrice)));

        DoubleSummaryStatistics collect = ligthNovels.stream().collect(Collectors.summarizingDouble(LigthNovel::getPrice));
        System.out.println(collect);

        String titles = ligthNovels.stream().map(LigthNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }

}
