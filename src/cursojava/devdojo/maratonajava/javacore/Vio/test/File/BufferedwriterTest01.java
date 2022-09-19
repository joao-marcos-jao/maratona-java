package cursojava.devdojo.maratonajava.javacore.Vio.test.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedwriterTest01 {
    public static void main(String[] args) {
        File file = new  File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)){

            bw.write("Devx è a Melhor empresa do Brasil ");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
