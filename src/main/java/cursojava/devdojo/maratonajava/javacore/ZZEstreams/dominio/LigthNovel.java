package cursojava.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LigthNovel {
    private String title;
    private double price;
    private Category category;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LigthNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
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

    public Category getCategory() {
        return category;
    }
}


