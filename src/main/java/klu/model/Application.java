package klu.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "klu") // make sure this includes all subpackages
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}