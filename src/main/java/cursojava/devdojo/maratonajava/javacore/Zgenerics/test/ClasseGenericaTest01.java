package cursojava.devdojo.maratonajava.javacore.Zgenerics.test;

import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Alugado o carro por um mês");
        carroRentavelService.retornarcarroAlugado(carro);


    }
}
