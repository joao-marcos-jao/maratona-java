package cursojava.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Daniela";
    static class Nested{
        private String lastname = "meu amor ";

        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastname);
        }
    }
    public static void main(String[] args) {
      OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();

    }
}
