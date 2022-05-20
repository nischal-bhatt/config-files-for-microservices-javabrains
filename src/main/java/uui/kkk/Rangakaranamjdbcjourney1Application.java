package uui.kkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

public class Rangakaranamjdbcjourney1Application {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "koothra");
		SpringApplication.run(Rangakaranamjdbcjourney1Application.class, args);
	}

}
