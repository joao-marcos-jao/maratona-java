package cursojava.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {
    public static void main(String[] args) {
        File file = new  File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            fw.write("Devx è a Melhor empresa do Brasil continuando a frase na proxima linha ");
            bw.newLine();
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


