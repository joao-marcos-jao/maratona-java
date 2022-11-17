package cursojava.devdojo.maratonajava.javacore.Minstefaces.test;

import cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio.DataLoader;
import cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio.DatabaseLoader;
import cursojava.devdojo.maratonajava.javacore.Minstefaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DatabaseLoader.retiveMaxDataSize();
        FileLoader.retiveMaxDataSize();
        DataLoader.retiveMaxDataSize();
    }

}

