package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoas {
    private String nome;
   private int idade;

    public void imprime () {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String x){
        this.nome = x;

    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println(" idade invalida");
            return;
        }
        this.idade = idade;

    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }

}
