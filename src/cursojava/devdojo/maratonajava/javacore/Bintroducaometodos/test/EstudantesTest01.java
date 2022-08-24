package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudantes;
import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoaraEstudantes;

public class EstudantesTest01 {
    public static void main(String[] args) {
        Estudantes estudantes01 = new Estudantes();
        Estudantes estudantes02 = new Estudantes();
        ImpressoaraEstudantes impressora = new ImpressoaraEstudantes();

        estudantes01.name = "Midoriay";
        estudantes01.age = 15;
        estudantes01.sex = 'M';

        estudantes02.name = "Sakura";
        estudantes02.age = 16;
        estudantes02.sex = 'F';

        impressora.imprime(estudantes01);

        impressora.imprime(estudantes02);




    }
}
