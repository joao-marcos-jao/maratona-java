package cursojava.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores (+ - * /)
        int numero1 = 20;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int subtracao = (numero1 - numero2);
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 /(double) numero2;
        String  resultado = "O total da soma é = "+ soma + "; O valor da subtração é = "+subtracao+"; O valor da multiplicação é ="+multiplicacao+"; O valor da divisão é = "+divisao;
        System.out.println(resultado);
        // para resto utiliza %
        int resto = 21 % 10;
        System.out.println("O resto da divisao 21/10 é = "+ resto);
        /*
         os operadores lógicos vao retonar valores booleanos (verdeiro ou falso) os valores booleanos são:
         menor <, maior >, menor igual <=; maior igual >=; igual ==; diferente !=
         */
        boolean IsDezMaiorQueVinte = 10 > 20;
        boolean IsDezMenorQueVinte = 10< 20;
        boolean IsDezMaiorIgualVinte = 10 >= 20;
        boolean IsDezMenorIgualVinte = 10 <= 20;
        boolean IsDezDiferenteDeVinte = 10 != 20;

        System.out.println("É dez maior que vinte "+IsDezMaiorQueVinte);
        System.out.println("É dez menor que vinte "+ IsDezMenorQueVinte);
        System.out.println("É dez maior igual a  vinte "+ IsDezMaiorIgualVinte);
        System.out.println("É dez menor igual a Vinte " + IsDezMenorIgualVinte);
        System.out.println("É dez diferente de vinte " + IsDezDiferenteDeVinte);








    }
}
