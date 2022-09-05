package cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio;

public interface DataLoader {
    public abstract void load();
    default void checkPermission (){
        System.out.println("Fazendo checagem de permissões");
    }
}
