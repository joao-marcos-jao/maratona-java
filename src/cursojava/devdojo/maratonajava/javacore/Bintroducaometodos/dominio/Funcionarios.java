package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    // atributos: name, idade, saláros
    public String name;
    public int age;
    public double[] salarey;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarey == null){
            return;
        }
        for (double salario : salarey) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();

    }
    public void imprimeMediaSalario() {
        if (salarey == null) {
            return;
        }

        double media = 0;
        for (double salario : salarey) {
            media += salario;
        }
        media /= salarey.length;
        System.out.println("\nMédia salarial: " + media);

    }

}
