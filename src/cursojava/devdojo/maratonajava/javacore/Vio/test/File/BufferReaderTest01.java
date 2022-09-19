package cursojava.devdojo.maratonajava.javacore.Vio.test.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) {
        File file= new File("file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) !=null){
                System.out.println(linha);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
