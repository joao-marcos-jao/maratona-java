package cursojava.devdojo.maratonajava.javacore.Kenum.dominio;

import cursojava.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.TipoCliente;

public class Cliente {
    public enum TipoPagamento{
        DEBITO, CREDITO
    }
    String nome;
    TipoCliente tipoCliente;
    TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoClienteint=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

