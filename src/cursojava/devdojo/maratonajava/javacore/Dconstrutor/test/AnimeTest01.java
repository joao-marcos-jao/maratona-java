package cursojava.devdojo.maratonajava.javacore.Dconstrutor.test;


import cursojava.devdojo.maratonajava.javacore.Dconstrutor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime("Kurama","TV", 12,"Ação");
        Anime anime2 = new Anime();
        //anime.init("Naruto", "TV", 12,"Ação");
        anime.imprime();
        anime2.imprime();
    }
}
