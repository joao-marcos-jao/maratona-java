package cursojava.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import cursojava.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carros;

public class carrosTest01 {
    public static void main(String[] args){
        Carros.setVelocidadeLimite(180);
        Carros carro1= new Carros("BMW", 280);
        Carros carro2= new Carros("Mercedes", 275);
        Carros carro3= new Carros("Audi", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


    }
}
