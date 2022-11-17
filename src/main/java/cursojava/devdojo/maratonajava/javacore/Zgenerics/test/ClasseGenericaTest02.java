package cursojava.devdojo.maratonajava.javacore.Zgenerics.test;

import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
    BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
       Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Alugado o barco por um mês");
        barcoRentavelService.retornarBarcoAlugado(barco);


    }
}
