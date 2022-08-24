package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Cauculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisnumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicacaoDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        System.out.println("não existe divisão por zero");
        return 0;
    }
    public void imprimaDivisaoDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

}
