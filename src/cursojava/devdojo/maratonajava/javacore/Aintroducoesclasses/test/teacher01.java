package cursojava.devdojo.maratonajava.javacore.Aintroducoesclasses.test;

import cursojava.devdojo.maratonajava.javacore.Aintroducoesclasses.dominio.Teacher;

public class teacher01 {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.name = "Kami";
        teacher.age = 140;
        teacher.sex = 'M';

        System.out.println("Nome " + teacher.name + " Idade: "+ teacher.age + " Sexo: " + teacher.sex);
    }
}

