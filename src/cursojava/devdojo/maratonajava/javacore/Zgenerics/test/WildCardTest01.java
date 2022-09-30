package cursojava.devdojo.maratonajava.javacore.Zgenerics.test;


abstract class Animal {
    public abstract void  consulta();

}

class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando o Jhon");

    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando  a Sativa ");
    }
}



