package cursojava.devdojo.maratonajava.javacore.Vio.test.File;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+ isCreated);
            System.out.println("Path "+ file.getPath());
            System.out.println("Path absolute" + file.getAbsolutePath());
            System.out.println("is file"+ file.isFile());
            System.out.println("is Directory"+ file.isDirectory());
            System.out.println("Is hiden"+ file.isHidden());
            System.out.println("Last of modified" + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exist = file.exists();
            if (exist) {
                System.out.println("Deleted "+ file.delete());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
