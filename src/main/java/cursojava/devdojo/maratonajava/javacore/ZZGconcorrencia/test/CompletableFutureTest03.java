package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiDepricated;
import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiDepricated storeServiDepricated = new StoreServiDepricated();

        serachPricesAsyncCompletableFuture(storeServiDepricated);

    }
    private static void serachPricesAsyncCompletableFuture(StoreServiDepricated storeServiDepricated){
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r->{
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1", " Store 2", " Store 3", " Store 4");
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiDepricated.getPriceSync(s),executor))
                .collect(Collectors.toList());

        List<Double> prices = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);

        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time Passed serach prices sync %dms%n", (end-start));
    }

}
