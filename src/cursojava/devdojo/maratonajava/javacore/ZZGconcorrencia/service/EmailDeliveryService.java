package cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import cursojava.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {

  private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
    String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting to deliver emsils ...");

        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(" Sending email to " + email);
                Thread.sleep(200);
                System.out.println(" Sent  the email successfully " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(" All emails were sent successfully ");
    }


}
