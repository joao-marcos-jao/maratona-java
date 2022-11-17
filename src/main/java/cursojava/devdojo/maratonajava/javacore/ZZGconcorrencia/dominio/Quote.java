package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Quote {
    private final String store;
    private final double price;
    private final Discount.code discountCode;

    private Quote(String store, double price, Discount.code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote from The value following pattern storeName:price:discountCode
     *
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.code getDiscountCode() {
        return discountCode;
    }
}


