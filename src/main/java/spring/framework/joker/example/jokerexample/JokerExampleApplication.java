package spring.framework.joker.example.jokerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokerExampleApplication.class, args);
	}

}
