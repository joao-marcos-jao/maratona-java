package cursojava.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import cursojava.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import cursojava.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public ProducerRepository() {
    }

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inseted producer '{}' in the datebase, rows afeected '{}'", producer.getName(), rowsAffected);


        } catch (SQLException e) {
            log.error("error while trying to inserted producer '{}'", producer.getName(), e);

        }

    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the datebase, rows afeected '{}'", id, rowsAffected);


        } catch (SQLException e) {
            log.error("error while trying to delete producer '{}'", id, e);

        }

    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}' from the datebase, rows afeected '{}'", producer.getId(), rowsAffected);


        } catch (SQLException e) {
            log.error("error while trying to delete producer '{}'", producer.getId(), e);

        }
    }
}iserindo
