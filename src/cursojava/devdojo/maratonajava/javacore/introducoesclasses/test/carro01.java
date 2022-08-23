package cursojava.devdojo.maratonajava.javacore.introducoesclasses.test;

import cursojava.devdojo.maratonajava.javacore.introducoesclasses.dominio.Carro;

import java.awt.*;

public class carro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Fusca Bala";
        carro1.Model = "Sport";
        carro1.year = 1969;

        carro2.name = "Mustang";
        carro2.Model = "Gt 500";
        carro2.year = 1968;
        carro1 = carro2;
        System.out.println(" Carro1");
        System.out.println(carro1.name);
        System.out.println(carro1.Model);
        System.out.println(carro1.year);

        System.out.println(" \n Carro2");
        System.out.println(carro2.name);
        System.out.println(carro2.Model);
        System.out.println(carro2.year);
    }
}
