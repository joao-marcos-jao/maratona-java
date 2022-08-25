package cursojava.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import cursojava.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.setNome("Naruto");
        anime.setTipo("Tv");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
