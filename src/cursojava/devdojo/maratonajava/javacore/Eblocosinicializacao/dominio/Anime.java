package cursojava.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime  {
    private String name;
    private int[] episodio = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime() {

        for (int episodio: this.episodio) {
            System.out.println(episodio+ " ");
        }

    }
}
