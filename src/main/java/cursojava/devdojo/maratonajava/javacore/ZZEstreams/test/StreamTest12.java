package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LigthNovel>> categoryLigthNovelMap = new HashMap<>();
        List<LigthNovel> drama = new ArrayList<>();
        List<LigthNovel> fantasy = new ArrayList<>();
        List<LigthNovel> romance = new ArrayList<>();
        for (LigthNovel ligthNovel : ligthNovels) {
            switch (ligthNovel.getCategory()){
                case DRAMA : drama.add(ligthNovel); break;
                case FANTASY : fantasy.add(ligthNovel); break;
                case ROMANCE : romance.add(ligthNovel); break;



            }
        }
        categoryLigthNovelMap.put(Category.DRAMA, drama);
        categoryLigthNovelMap.put(Category.FANTASY, fantasy);
        categoryLigthNovelMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLigthNovelMap);

        Map<Category, List<LigthNovel>> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory));
        System.out.println(collect);


    }

}
