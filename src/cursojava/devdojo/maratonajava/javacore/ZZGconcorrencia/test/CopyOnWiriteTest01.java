package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWiriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);

        }
        Runnable runnableInteretor = ()-> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        };
        Runnable runnableRemover = ()->{
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(),i);

            }

        };
        new Thread (runnableInteretor).start();
        new Thread(runnableInteretor).start();
        new Thread(runnableRemover).start();
    }
}
