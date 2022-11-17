package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
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
        Map<Object, List<LigthNovel>> collect = ligthNovels
                .stream()
                .collect(groupingBy(StreamTest13::getPromotion
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = ligthNovels.stream().collect(groupingBy(LigthNovel::getCategory,
                groupingBy(StreamTest13::getPromotion
                )));
        System.out.println(collect1);

    }

    private static Promotion getPromotion(LigthNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}
