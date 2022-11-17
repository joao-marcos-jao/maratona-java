package cursojava.devdojo.maratonajava.javacore.Npolimorfismo.test;


import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main (String[] args){
        Computador computador =new Computador("Nuci7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 5000);

       CalculadoraImposto.cacularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.cacularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.cacularImposto(televisao);
    }
}
