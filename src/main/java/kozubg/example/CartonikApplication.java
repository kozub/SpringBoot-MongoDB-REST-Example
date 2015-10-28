package kozubg.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // componentScan, enableAutoConfiguration, configuration
public class CartonikApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartonikApplication.class, args);
    }
}
