package cursojava.devdojo.maratonajava.javacore.ZZIjdbc.test;
;
import cursojava.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import cursojava.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import cursojava.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTestes01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        //ProducerService.save(producer);
        ProducerService.update(producerToUpdate);

    }

}
