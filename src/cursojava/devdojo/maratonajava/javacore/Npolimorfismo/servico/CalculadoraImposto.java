package cursojava.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void cacularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate)produto).getDataDeValidade();
            System.out.println (dataValidade);
        }
    }
}
