package cursojava.devdojo.maratonajava.javacore.Oexception.exception.test;

import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor01;
import cursojava.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResorcesTest01 {
    public static void main(String[] args) {
        lerarquivo();
    }

    public static void lerarquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (Exception e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
