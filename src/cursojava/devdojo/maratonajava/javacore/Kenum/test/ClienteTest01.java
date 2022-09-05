package cursojava.devdojo.maratonajava.javacore.Kenum.test;

import cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.TipoCliente;
import cursojava.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Boruto", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Saratobi",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
