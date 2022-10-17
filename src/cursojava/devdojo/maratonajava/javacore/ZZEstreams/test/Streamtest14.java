package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamtest14 {
    private static List<LigthNovel> ligthNovels =new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LigthNovel("Over Lord", 10.99, Category.FANTASY),
            new LigthNovel("Violet evergarden",5.99, Category.DRAMA),
            new LigthNovel("No Game no life",2.99, Category.FANTASY),
            new LigthNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LigthNovel("Kumo desuga",1.99, Category.FANTASY),
            new LigthNovel("Kumo desuga",1.99, Category.FANTASY),
            new LigthNovel("Monogatari",4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LigthNovel>> collect1 = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LigthNovel> collect2 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LigthNovel> collect3 = ligthNovels.stream().collect(Collectors.toMap(LigthNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect3);
    }
}
