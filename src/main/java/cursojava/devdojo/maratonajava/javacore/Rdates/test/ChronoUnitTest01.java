package cursojava.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1996,Month.MARCH,7,18,00,00);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Joyce tem :");
        System.out.println(ChronoUnit.DAYS.between(aniversario, now)+ " Dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now)+ " Semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now)+ " Meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now)+ " Anos");
    }
}
