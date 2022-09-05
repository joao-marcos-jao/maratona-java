package cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados do arquivo");
    }

    @Override
    public void remove() {
        System.out.println("removendo Dado de um arquivo");
    }
}
