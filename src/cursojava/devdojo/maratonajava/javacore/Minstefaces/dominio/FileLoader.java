package cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("carregando dados do arquivo");
    }
}
