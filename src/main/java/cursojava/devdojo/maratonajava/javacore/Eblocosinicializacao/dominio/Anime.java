package cursojava.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String name;
    private int[] episodio ;
    {
        System.out.println("Dentro do bloco de inicialização");
        episodio = new int[100];
        for(int i = 0; i < episodio.length; i++){
            episodio[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodio : this.episodio) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodio() {
        return episodio;
    }
}
