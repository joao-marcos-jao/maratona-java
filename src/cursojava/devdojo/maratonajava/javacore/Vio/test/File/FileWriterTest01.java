package cursojava.devdojo.maratonajava.javacore.Vio.test.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new  File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("Devx è a Melhor empresa do Brasil \ncontinuando a frase na proxima linha \n");
            fw.flush();

        } catch (IOException e) {
         e.printStackTrace();
        }


    }
}
