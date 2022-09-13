package cursojava.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DatesTest01 {
    public static void main(String[] args) {
        Date date = new Date(1663085826849L);// long 100000
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }
}
