package cursojava.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamInterate(num);
        sumParallelStreamInterate(num);
        sumLongStreamInterate(num);
        sumParallelLongStreamInterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init + "ms"));
    }



        private static void sumStreamInterate ( long num){
            System.out.println("sumStreamInterate");

            long init = System.currentTimeMillis();
            long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
            long end = System.currentTimeMillis();
            System.out.println(result + " " + (end - init + "ms"));

        }
    private static void sumParallelStreamInterate ( long num) {
        System.out.println("sumParallelStreamInterate ");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init + "ms"));
    }
    private static void sumLongStreamInterate ( long num) {
        System.out.println("sumLongStreamInterate  ");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init + "ms"));
    }
    private static void sumParallelLongStreamInterate ( long num) {
        System.out.println("sumParallelLongStreamInterate  ");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init + "ms"));
    }

}
