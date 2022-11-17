package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formmatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static void beep(){
        Runnable r = ()-> {
            System.out.println(LocalTime.now().format(formmatter)+" beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
       // executor.schedule(r,5, TimeUnit.SECONDS);
       // ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r,1, 5, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("Cancelando o scheduledWithFixedDelay ");
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();

        },10,TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        beep();
    }

}
