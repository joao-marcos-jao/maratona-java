package cursojava.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import cursojava.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "Overlord", 25));

   public static Optional<Manga> findById(Integer id) {
        return findBy(m-> m.getId().equals(id));
    }


    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> prdicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (prdicate.test(manga)) {
                found = manga;

            }
        }
        return Optional.ofNullable(found);
    }

}
