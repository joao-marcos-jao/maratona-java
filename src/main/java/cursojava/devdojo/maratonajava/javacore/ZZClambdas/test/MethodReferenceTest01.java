package cursojava.devdojo.maratonajava.javacore.ZZClambdas.test;

import cursojava.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import cursojava.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        ArrayList<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 47), new Anime("One piece", 900), new Anime("Naruto", 500)));
        Collections.sort(animeList,(a1, a2)-> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList,AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
