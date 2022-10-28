package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Discount {
    public enum code{

        NONE(0), SUPER_SAIJIN1(5), SUPER_SAIJIN2(10), SUPER_SAIJIN3(15);
        private final int percentage;

        code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }

}
