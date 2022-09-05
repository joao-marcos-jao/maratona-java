package cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}
