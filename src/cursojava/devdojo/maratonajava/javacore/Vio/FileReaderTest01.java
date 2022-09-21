package cursojava.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file =new File("file.txt");
        try (FileReader fr= new FileReader(file)){
            char [] in = new char[225];
            int size = fr.read(in);
            System.out.println(size);
            for (char c : in) {
                System.out.print(c);
            }

       //     System.out.println(fr.read());

        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
