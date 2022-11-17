package cursojava.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundletest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("menssages",new Locale("en", "US"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hello"));
       bundle = ResourceBundle.getBundle("menssages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

    }
}
