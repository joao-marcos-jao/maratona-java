package cursojava.devdojo.maratonajava.javacore.Dconstrutor.test;


import cursojava.devdojo.maratonajava.javacore.Dconstrutor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime("Naruto","Tv", 300, "ação", "Production DevX");
        //anime.init("Naruto", "TV", 12,"Ação");
        anime.imprime();

    }
}
