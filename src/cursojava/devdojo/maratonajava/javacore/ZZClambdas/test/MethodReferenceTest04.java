package cursojava.devdojo.maratonajava.javacore.ZZClambdas.test;
//Reference to a constructor

import cursojava.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import cursojava.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 47), new Anime("One piece", 100), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episode)-> new Anime(title, episode);
        BiFunction<String, Integer, Anime> animeBifunction2 = Anime::new;
        System.out.println(animeBifunction2.apply("Super Campeões", 36));


    }
}
