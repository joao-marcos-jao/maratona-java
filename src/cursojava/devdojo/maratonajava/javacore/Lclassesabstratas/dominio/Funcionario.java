package cursojava.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {
    String nome;
    protected double salario;



    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }
}
