package cursojava.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;
import java.util.Objects;


public class Manga implements Comparable <Manga>{
   private Long id;
   private String nome;
   private double preco;

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(manga.preco, preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //Negativo se o this < outro manga
        // se this == outroManga, return 0
        // positivo se this > outroManga
        //if (this.id < outroManga.getId()){
          //  return -1;
            
     //   }else if (this.id.equals(outroManga.getId())) {
          //  return 0;
       // }else {
        //    return 1;
        return this.nome.compareTo(outroManga.getNome());
       // return Double.compare(preco,outroManga.getPreco());
       // return this.id.compareTo(outroManga.getId());
        }
      
    }

