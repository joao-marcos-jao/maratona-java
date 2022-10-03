package cursojava.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTes02 {
    private String name = "Midorya";
    void print(final String param){
         final String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name+ " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTes02 outer = new OuterClassesTes02();
        outer.print("");

    }
}
