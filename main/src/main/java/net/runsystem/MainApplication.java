package net.runsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Description:
 *
 * @author: GMO_ThanhND
 * @version: 1.0
 * @since 3/23/2022 5:16 PM
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"net.runsystem"})
@EntityScan(basePackages = {"net.runsystem"})
public class MainApplication {
 public static void main(String[] args) {
  SpringApplication.run(MainApplication.class);
 }

}
