package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Joao");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(),bq.peek());
        System.out.println("Tryinng to add anothe value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Marcos");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }
    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from Queue %s%n", Thread.currentThread().getName(),bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
