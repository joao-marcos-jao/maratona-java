package cursojava.devdojo.maratonajava.javacore.Isobreescrita.dominio;

public class Anime {
    String nome;



    public String toString() {
        return "Anime " + this.nome;

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
