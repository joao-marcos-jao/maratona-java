package cursojava.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeTest03 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Fechando Recurso Liberado pelo SO");
        }
        return null;
    }
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando Recurso Liberado pelo SO");
        }
    }
}
