package cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LigthNovel {
    private String title;
    private double price;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LigthMovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LigthNovel that = (LigthNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

