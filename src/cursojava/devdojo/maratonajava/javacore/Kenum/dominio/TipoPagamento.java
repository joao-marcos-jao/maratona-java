package cursojava.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double caucularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double caucularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double caucularDesconto (double valor);

}