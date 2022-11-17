package cursojava.devdojo.maratonajava.javacore.Aintroducoesclasses.test;

import cursojava.devdojo.maratonajava.javacore.Aintroducoesclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.name = "João";
        estudante.age = 29;
        estudante.sex = 'M';
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
