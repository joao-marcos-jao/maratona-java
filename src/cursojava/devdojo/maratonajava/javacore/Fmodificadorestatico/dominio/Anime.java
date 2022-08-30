package cursojava.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String name;
    private static int[] episodio ;
    // O bloco de inicialização é executado quando a Jvm carregar a classe
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é cria e inicializado com valores default
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estatic 1");
        episodio = new int[100];
        for(int i = 0; i < episodio.length; i++){
            episodio[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estatic 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estatic 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização|");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodio : Anime.episodio) {
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
