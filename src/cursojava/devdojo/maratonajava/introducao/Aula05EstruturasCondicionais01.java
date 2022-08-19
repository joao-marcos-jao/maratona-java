package cursojava.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int age = 15;
        boolean IsAutorizadoComprBebida = age >= 18;
        //!
        if (age >=18){
            System.out.println("Autorizado comprar bebida alcólica");
        }else {
            System.out.println("Não Autorizado comprar bebida alcólica");
        }
        if (!IsAutorizadoComprBebida ){
            System.out.println("Não Autorizado comprar bebida alcólica");
        }
        System.out.println("Fora do if");

    }
}
