package cursojava.devdojo.maratonajava.javacore.ZZFthreads.service;

import cursojava.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "Starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails()> 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName+" Enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName +" Enviou o email com sucesso " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " Todos emails foram enviado com sucesso");

    }
}
