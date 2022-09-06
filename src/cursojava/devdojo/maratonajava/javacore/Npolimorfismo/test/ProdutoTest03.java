package cursojava.devdojo.maratonajava.javacore.Npolimorfismo.test;

import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rizen 9 ", 3000);
        Tomate tomate = new Tomate("Tomate Longa Vida", 20);
        tomate.setDataDeValidade("11/12/2022");
        CalculadoraImposto.cacularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.cacularImposto(produto);
    }
}
