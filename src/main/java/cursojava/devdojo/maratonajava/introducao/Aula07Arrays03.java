package cursojava.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};
        // for (i = 0;  i < numeros3.length; i++)
        //System.out.ptintln(numero3[i]);
        //for (int i = 0; i < numeros3.length; i++) {
         //   System.out.println(numeros3[i]);

        for (int num:numeros3) {
            System.out.println(num);
        }
    }

}
