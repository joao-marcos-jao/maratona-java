package cursojava.devdojo.maratonajava.javacore.Zgenerics.test;

import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criaArrayComObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }
    public static <T> List<T> criaArrayComObjeto(T t){
        return List.of(t);
    }
}
