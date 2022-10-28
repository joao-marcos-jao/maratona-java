package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiDepricated {
    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGeneretor();

    }
    private double priceGeneretor(){
        System.out.printf("Generating price%s%n", Thread.currentThread().getName());
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }
    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

