package cursojava.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;



public class Carros{
    private String nome;
  private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carros (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println(" nome "+ this.nome);
        System.out.println(" Velocidade Maxima " + this.velocidadeMaxima);
        System.out.println(" Velocidade Limite "+ Carros.velocidadeLimite);
    }
        public String getNome(){
        return nome;
        }

    public void getnome(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getvelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }



}

