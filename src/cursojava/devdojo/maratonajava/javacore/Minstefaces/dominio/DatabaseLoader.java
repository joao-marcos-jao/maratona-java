package cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando Dados do Banco de Dados");
    }


    @Override
    public void remove() {
        System.out.println("Removendo dado do banco de dados");
    }
}
