package cursojava.devdojo.maratonajava.javacore.Npolimorfismo.test;

import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
