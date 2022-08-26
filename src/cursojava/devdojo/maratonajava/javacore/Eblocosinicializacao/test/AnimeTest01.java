package cursojava.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import cursojava.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodio()) {
            System.out.print(episodio+ " ");

            
        }


    }

    }

