package cursojava.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        /*
        Idade < 15 categoria infantil
        idade >= 15 && idade < 18 categoria juvenil
        idade >= 18 categoria adulto
         */
        int age = 29;
        String categoria;
        if (age < 15){
            categoria = "categoria infantil";
        } else if (age >= 15 && age < 18) {
            categoria = "Juvenil";

        }else {
            categoria = "Categoria Adulto";
            System.out.println(categoria);
        }
    }
}
