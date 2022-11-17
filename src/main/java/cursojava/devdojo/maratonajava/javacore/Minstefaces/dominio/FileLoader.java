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

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissoes no arquivo");
    }
    public static void retiveMaxDataSize(){
        System.out.println("Dentro do retiveMaxDataSixe da interface");
    }
}
