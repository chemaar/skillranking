package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"es.uc3m"})
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
