package cursojava.devdojo.maratonajava.introducao;

import com.sun.jdi.connect.Connector;

import javax.print.DocFlavor;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        // Doar se salario > 5000
        double salarey = 6000;
        String mensagemDoar = "Eu Vou Doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condição) ? Verdadeiro : falso;
        String resultado = salarey > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
