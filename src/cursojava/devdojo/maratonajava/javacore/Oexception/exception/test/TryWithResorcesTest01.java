package cursojava.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResorcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
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
