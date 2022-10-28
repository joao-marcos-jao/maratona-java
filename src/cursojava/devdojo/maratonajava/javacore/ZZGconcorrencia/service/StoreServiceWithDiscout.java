package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Discount;
import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscout {
    public String getPriceSync(String storeName){
        Double price  = priceGeneretor();
        Discount.code discountCode = Discount.code.values()
                [ThreadLocalRandom.current().nextInt(Discount.code.values().length)
                ];
        return String.format("%s:%s:%s",storeName,price,discountCode);
    }
   public String applyDiscount(Quote quote){
        delay();
       double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) /100;
        return String.format("'%s' Original price: '%.2f'. Appling discount code '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue
                );


    }
    private double priceGeneretor(){
        delay();
        return ThreadLocalRandom.current().nextInt(1,500) * 10;

    }
    private void delay(){
        try {
            int milli = ThreadLocalRandom.current().nextInt(200,2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
