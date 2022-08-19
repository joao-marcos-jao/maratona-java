package cursojava.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salareyAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa =  37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salareyAnual <= 34712){
            valorImposto = salareyAnual * primeiraFaixa;
        } else if (salareyAnual >= 34713 && salareyAnual <= 68507) {
            valorImposto = salareyAnual * segundaFaixa;
        }else {
            valorImposto = salareyAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);


    }
}
