package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(ligthNovels.stream().anyMatch(ln-> ln.getPrice() > 9));
        System.out.println(ligthNovels.stream().allMatch(ln-> ln.getPrice()>0));
        System.out.println(ligthNovels.stream().noneMatch(ln-> ln.getPrice() < 0));
        ligthNovels.stream()
                .filter(ln-> ln.getPrice() >3)
                .findAny()
                .ifPresent(System.out::println);

        ligthNovels
                .stream()
                .filter(ln-> ln.getPrice() >3)
                .sorted(Comparator.comparing(LigthNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        ligthNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LigthNovel::getPrice))
                .ifPresent(System.out::println);


    }
}
