package cursojava.devdojo.maratonajava.javacore.Zgenerics.test;

import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import cursojava.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o Carro por ume mês... ");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
       Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o Baros por um mês: ");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
