package cursojava.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numero pares de 0 a 1000000
        for (int i=0; i <= 1000000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
