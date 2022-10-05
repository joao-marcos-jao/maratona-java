package cursojava.devdojo.maratonajava.javacore.ZZClambdas.test;

import cursojava.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import cursojava.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencetes02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 47), new Anime("One piece", 100), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1,a2)-> animeComparators.compareByEpisodesNonStatic(a1, a2));

        System.out.println(animeList);

    }
}
