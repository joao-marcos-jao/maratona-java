package cursojava.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDotecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O Grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("sim");
        }else {
            System.out.println("nao");
        }
    }
}
