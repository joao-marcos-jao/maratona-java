package cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;

    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
