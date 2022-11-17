package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphigDesigners = List.of("Wildnei Suane", "Catarina santos", "Sandy Carolina");
        List<String> devolopers = List.of("William", "David", "Harison");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devDojo.add(graphigDesigners);
        devDojo.add(devolopers);
        devDojo.add(students);
        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
