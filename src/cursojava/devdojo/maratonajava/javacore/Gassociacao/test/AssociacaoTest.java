package cursojava.devdojo.maratonajava.javacore.Gassociacao.test;

import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua indiá");
        Aluno aluno = new Aluno("João Marcos", 29);
        Professor professor = new Professor("Fabão", "Senior Java");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Progamador Java", alunosParaSeminario, local);

        Seminario[] seminariosdisponiveis = {seminario};
        professor.setSeminarios(seminariosdisponiveis);
        professor.imprime();
    }
}
