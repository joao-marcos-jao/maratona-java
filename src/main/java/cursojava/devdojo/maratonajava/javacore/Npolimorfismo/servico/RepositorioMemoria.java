package cursojava.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import cursojava.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em mémoria");
    }
}
