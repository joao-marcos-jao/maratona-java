package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    // atributos: name, idade, saláros
    private
    String name;
 private int age;
    private double[] salarey;
    private double media = 0;

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


        for (double salario : salarey) {
            media += salario;
        }
        media /= salarey.length;
        System.out.println("\nMédia salarial: " + media);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarey(double[] salarey) {
        this.salarey = salarey;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalarey() {
        return salarey;
    }

    public double getMedia() {
        return media;
    }
}
