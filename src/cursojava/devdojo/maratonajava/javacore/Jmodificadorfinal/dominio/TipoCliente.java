package cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Fisica"),
    PESSOA_FISICA(2, "Pessoa Juridica");

    private final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
