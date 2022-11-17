package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscout;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscout service = new StoreServiceWithDiscout();
        searchpriceWithDiscountAsync(service);
    }
    private static void searchpriceWithDiscountAsync(StoreServiceWithDiscout service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of(" Store1", "Store2", "Store3", "store4");
      List<CompletableFuture<String>> completableFutures =stores.stream()
              // Geting the price async storeName:price:dicountCode
              .map(s-> CompletableFuture.supplyAsync(()-> service.getPriceSync(s)))
              // instantiating a new quote from the string genereted by getpricesync
              .map(cf-> cf.thenApply(Quote::newQuote))
              .map(cf-> cf.thenCompose(quote->CompletableFuture.supplyAsync(()->service.applyDiscount(quote))))
              .collect(Collectors.toList());
      completableFutures.stream()
              .map(CompletableFuture::join)
              .forEach(System.out::println);
       long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));


    }

    private static void searchpriceWithDiscount(StoreServiceWithDiscout service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of(" Store1", "Store2", "Store3", "store4");
        // stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));


    }
}
