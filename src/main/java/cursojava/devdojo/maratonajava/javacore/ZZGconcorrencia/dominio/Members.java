package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open =true;


    public boolean isOpen(){
        return open;
    }
    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
    }
    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou o email na lista");
            this.emails.add(email);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Chekin is there are emails \n");
        lock.lock();
        try {
            while (this.emails.size() == 0){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " There is no email in the list, going into standby mode \n");
                condition.await();
            }
            return this.emails.poll();

        }finally {
            lock.unlock();
        }

    }

    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notifying everyone that we are no longer getting emails");
            condition.signalAll();

        }finally {
            lock.unlock();

        }
    }


}
