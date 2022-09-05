package cursojava.devdojo.maratonajava.javacore.Hheranca.test;

import cursojava.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de Inicialização estático da super classe é executada quando a JVM carregar a classe pai
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVMcarregar a classe filha
// 2 - Cada atributo de classe é criado e inicializado com valores default ou que for passado da classe pai
// 3 - Alocado Espaço em memoria pro obeto da superclasse
// 4 -  Bloco de Inicialização da superclasse é executado na ordem que aparece
// 5 -  Construtor é executado da superclasseclasse
// 6 - Alocado espaço em memória pro objeto da subclasse
// 7 - Cada atributo de Subclasse é criado e inicializado com valores default ou quer for passado
// 8 - Bloco de Inicialização da subclasse é executado  na ordem que aparece
// 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
