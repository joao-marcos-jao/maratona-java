package cursojava.devdojo.maratonajava.javacore.introducoesclasses.test;

import cursojava.devdojo.maratonajava.javacore.introducoesclasses.dominio.Estudante;

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
