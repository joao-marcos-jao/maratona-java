package cursojava.devdojo.maratonajava.introducao;

import java.awt.*;
import java.sql.SQLOutput;

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
        /*
         outros operadores lógicos
         && (And) que é [e]; || (OR) que é [OU]; ! (Negação)
         */
        int age = 29;
        float salary = 1000F;
        boolean IsDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("IsDentroDaLeiMaiorQueTrinta"+IsDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta"+IsDentroDaLeiMenorQueTrinta);

        double ValorTotalCorrente = 200;
        double ValorTotalPoupanca = 10000;
        float ValorPlaystation = 500F;
        boolean ValorPlaytationCincoCompravel = ValorTotalCorrente > ValorPlaystation || ValorTotalPoupanca > ValorPlaystation;
        System.out.println("ValorPlaytationCincoCompravel"+ValorPlaytationCincoCompravel);

        // Operadores de Atribuição =, +=, -=, *=, /=, %=
         double bonus= 1800;
        bonus = bonus + 1000;
        bonus = bonus - 1000;
        bonus = bonus * 2;
        bonus = bonus % 2;
        System.out.println("O bonus é igua a "+bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(++contador2);















    }
}
