package cursojava.devdojo.maratonajava.javacore.Zgenerics.service;

import cursojava.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando Carro disponivel... ");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+ carro);
        System.out.println("carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarcarroAlugado(Carro carro){
        System.out.println("Devolvndo Carro: "+ carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros Disponiveis Para alugar: ");
        System.out.println(carrosDisponiveis);
    }

}

