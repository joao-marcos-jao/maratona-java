package cursojava.devdojo.maratonajava.javacore.Sformatação.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String patern  = "'Amsterdam' dd 'de' MM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(patern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 14 de 09 de 2022"));
        } catch (ParseException e) {
           e.printStackTrace();
        }

    }
}
