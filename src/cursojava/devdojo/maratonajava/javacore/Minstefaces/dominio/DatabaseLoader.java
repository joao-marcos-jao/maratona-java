package cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando Dados do Banco de Dados");
    }
}
