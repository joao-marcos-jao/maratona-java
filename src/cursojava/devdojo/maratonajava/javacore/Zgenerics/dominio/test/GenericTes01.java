package cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.test;

import cursojava.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericTes01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Vegeta");
        lista.add("Goku");

        for (String o : lista) {
            System.out.println(o);

        }
        add(lista, new Consumidor("Sayajin"));

        for (Object o : lista) {
            System.out.println(o);

        }
    }
    private static void add (List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
