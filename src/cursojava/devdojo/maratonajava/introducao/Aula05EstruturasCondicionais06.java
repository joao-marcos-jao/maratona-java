package cursojava.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando o switch e dado os valores de 1 a 7, imprima se o dia é útil o se é final de semana
        // considerando 1 com domingo
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}
