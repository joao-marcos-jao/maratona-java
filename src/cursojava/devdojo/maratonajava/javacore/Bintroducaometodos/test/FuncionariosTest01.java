package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.name = "João";
        funcionarios.age = 29;
        funcionarios.salarey = new double[]{500, 1000, 1600};

       funcionarios.imprime();



    }
}
