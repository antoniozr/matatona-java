package academy.devdojo.maratonajava.javacore.ZZijdbc.test;

import academy.devdojo.maratonajava.javacore.ZZijdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZijdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZijdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZijdbc.service.ProducerService;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerService.save(producer);
        ProducerService.delete(7);
    }
}
