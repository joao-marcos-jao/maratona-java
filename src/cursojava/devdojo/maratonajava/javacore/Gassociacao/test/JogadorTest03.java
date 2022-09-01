package cursojava.devdojo.maratonajava.javacore.Gassociacao.test;

import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import cursojava.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Time time = new Time("Milan");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---- Jogador-----");
        jogador.imprime();

        System.out.println("--- time ----");
        time.imprime();
    }
}
