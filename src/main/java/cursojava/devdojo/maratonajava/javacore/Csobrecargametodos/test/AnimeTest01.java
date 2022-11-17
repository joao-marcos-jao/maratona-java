package cursojava.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import cursojava.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12,"Ação");
        anime.imprime();
    }
}
