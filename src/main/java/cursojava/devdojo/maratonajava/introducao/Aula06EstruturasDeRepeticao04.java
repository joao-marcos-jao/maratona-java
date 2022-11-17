package cursojava.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro descubra em  quantas veze que ele pode ser parcelado
    // Condição que o valor da parcela <= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
                System.out.println("Parcela "+parcela+" R$"+valorParcela);


        }

    }
}
