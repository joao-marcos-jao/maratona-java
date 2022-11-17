package cursojava.devdojo.maratonajava.javacore.ZZFthreads.test;

import cursojava.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAcountTest01 implements Runnable {
    private final Account acount = new Account();

    public static void main(String[] args) {
        ThreadAcountTest01 threadAcountTest01 = new ThreadAcountTest01();
        Thread t1 = new Thread(threadAcountTest01, "Hestia");
        Thread t2 = new Thread(threadAcountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (acount.getBalance() < 0) {
                System.out.println("Fudeuuuu");
            }

        }

    }

    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " ***fora do Synchronized");
        synchronized (acount) {
            System.out.println(getThreadName() + " ###Dentro do Synchronized");
            if (acount.getBalance() >= amount) {
                System.out.println(getThreadName() + " Esta indo sacar o Dinheiro");
                acount.withdrawal(amount);
                System.out.println(getThreadName() + " Completou o saque, o valor atual da conta " + acount.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + acount.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
