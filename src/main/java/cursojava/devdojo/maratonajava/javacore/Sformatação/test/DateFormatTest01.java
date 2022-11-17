package cursojava.devdojo.maratonajava.javacore.Sformatação.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat:df) {
            System.out.println(dateFormat.format(calendar.getTime()));
            
        }

    }

    public static class LocaleTest01 {
        public static void main(String[] args) {
            Locale localeItaly = new Locale("it","IT");
            Locale localeCH = new Locale("ch","CH");
            Locale localeIndia = new Locale("hi", "IN");
            Locale localeJapao = new Locale("ja", "JP");
            Locale localeHolanda = new Locale("nl", "Nl");

            Calendar calendar = Calendar.getInstance();
           DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
            DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
            DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
            DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
            DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

            System.out.println("Italia " + df1.format(calendar.getTime()));
            System.out.println("Suiça " + df2.format(calendar.getTime()));
            System.out.println("India " + df3.format(calendar.getTime()));
            System.out.println("Japao " + df4.format(calendar.getTime()));
            System.out.println("Holanda " + df5.format(calendar.getTime()));

            System.out.println(localeItaly.getDisplayCountry(localeJapao));
            System.out.println(localeCH.getDisplayCountry(localeJapao));
        }
    }
}
