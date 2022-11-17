package cursojava.devdojo.maratonajava.javacore.Xserializacao.test;

import cursojava.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import cursojava.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SrializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Joao", "123456");
        Turma turma = new Turma("Maratona Java virado no Jiraya em breve ricos");
        aluno.setTurma(turma);
        serilizar(aluno);
        deserilizar();

    }
    private static void serilizar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserilizar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
