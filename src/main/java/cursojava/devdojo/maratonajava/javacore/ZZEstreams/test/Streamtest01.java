package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Order LigthNovel By tittle
// 2. Retrieve the first 3 ligth novels witch price less than 4
public class Streamtest01 {
    private static  List<LigthNovel> ligthNovels =new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Over Lord", 3.99),
            new LigthNovel("Violet evergarden",5.99),
            new LigthNovel("No Game no life",2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga",1.99),
            new LigthNovel("Monogatari",4.00)
    ));
    public static void main(String[] args) {
        ligthNovels.sort(Comparator.comparing(LigthNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LigthNovel ligthNovel : ligthNovels) {
            if (ligthNovel.getPrice() <=4){
                titles.add(ligthNovel.getTitle());
            }
            if (titles.size() >=3){
                break;

            }

        }

        System.out.println(ligthNovels);
        System.out.println(titles);


    }
}
