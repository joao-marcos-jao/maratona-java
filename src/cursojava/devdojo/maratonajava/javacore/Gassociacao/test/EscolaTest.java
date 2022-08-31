package cursojava.devdojo.maratonajava.javacore.Gassociacao.test;

import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("kakashi");
        Professor[] profesores = {professor, professor1};
        Escola escola = new Escola("Konoha", profesores);

        escola.imprime();

    }
}
