package cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoas{
    String nome;
    protected double salario;



    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        cauculaBonus();

    }
    public abstract void cauculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo.../");
    }
}
