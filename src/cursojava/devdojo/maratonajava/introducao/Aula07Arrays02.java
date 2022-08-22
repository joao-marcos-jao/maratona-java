package cursojava.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    // byte, short, int, long, float e double= 0
    // char '\U000'''
    // boolean false
    // String null
    public static void main(String[] args){
        String [] name = new String[3];
        name [0] = "Goku";
        name [1] = " Naruto";
        name [2] = "Boruto";
        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);
        }
    }
}
