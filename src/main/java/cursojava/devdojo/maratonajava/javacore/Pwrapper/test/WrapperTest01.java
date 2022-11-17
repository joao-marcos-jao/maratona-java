package cursojava.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 1;
        int intp= 1;
        long longp = 10L;
        float floatp = 10F;
        double doublep = 10D;
        char charp = 'w';
        boolean  booleanp = false;

        Byte bytew = 1;
        Short shortw = 1;
        Integer intw= 1; // autoboxing
        Long longw = 10L;
        Float floatw = 10F;
        Double doublew = 10D;
        Character charw = 'w';
        Boolean booleanw = false;

        int i = intw;// onboxing
        Integer intw2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);


        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));



    }
}
