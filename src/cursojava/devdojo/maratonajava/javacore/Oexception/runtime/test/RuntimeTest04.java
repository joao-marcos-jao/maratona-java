package cursojava.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeTest04 {
    public static void main(String[] args) {
        try {
throw new RuntimeException();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch ( IllegalArgumentException e){
            System.out.println("Dentro Do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        }catch (SQLException e) {

        }catch (FileNotFoundException e){

        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
