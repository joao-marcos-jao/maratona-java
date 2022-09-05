package cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
