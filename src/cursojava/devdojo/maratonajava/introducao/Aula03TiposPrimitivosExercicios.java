package cursojava.devdojo.maratonajava.introducao;
 /*
    Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <name>, morando no endereço <address>,
    confirmo que recebi o salário de <wage>, na data <date>
     */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String []args){
        String name = "João Marcos Rodrigues de Oliveira";
        String address = "Rua Jundiaí Qd 96, Lt 8";
        double wage = 1000;
        String SalaryReceiptDate = "18 de agosto de 2020";
        String relatorio = "Eu "+name+" morando no endereço "+ address+" confirmo que recebi o salário de "+wage+" na data "+SalaryReceiptDate;

        System.out.println(relatorio);
    }


}
