package cursojava.devdojo.maratonajava.javacore.Sformatação.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberTest01 {
    public static void main(String[] args) {
        Locale locaDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeUS);
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.getMaximumFractionDigits();
            System.out.println(numberFormat.format(valor));
            
        }
        String valorString = "10000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
