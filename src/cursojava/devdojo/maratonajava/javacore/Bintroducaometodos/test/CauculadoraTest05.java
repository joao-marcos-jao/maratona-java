package cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import cursojava.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cauculadora;

public class CauculadoraTest05 {
    public static void main(String[] args){
        Cauculadora cauculadora = new Cauculadora();
        int[] numeros= {1,2,3,4,5};
        cauculadora.somaArray(numeros);
        cauculadora.somaVarArgs(1,2,3,4,5,6);
    }
}
