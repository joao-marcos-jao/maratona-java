package cursojava.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List <String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsilnh ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");
        Collections.sort(mangas);


            List <Double> dinheiros = new ArrayList<>(6);
            dinheiros.add(100.21);
            dinheiros.add(23.98);
            dinheiros.add(21.21);
            dinheiros.add(98.10);


        for (String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
