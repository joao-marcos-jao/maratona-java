package cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    public final int VALOR;

    TipoCliente(int VALOR) {
        this.VALOR = VALOR;

    }

    public int getVALOR() {
        return VALOR;
    }
}
