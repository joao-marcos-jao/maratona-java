package cursojava.devdojo.maratonajava.javacore.Ycolecoes.test;

import cursojava.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Helsinki ultimate", 3.2,0));
        mangas.add(new Manga(3L, "Pokemon", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99,0));

  //Iterator<Manga> mangaInterator = mangas.iterator();
    //   while (mangaInterator.hasNext()){
      //     if (mangaInterator.next().getQuantidade() == 0){
        //       mangaInterator.remove();
          // }
      // }
       // System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
