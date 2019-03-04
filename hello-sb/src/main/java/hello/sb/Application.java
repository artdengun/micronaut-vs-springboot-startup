package hello.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(":: Spring Boot :: - " + LocalDateTime.now());
		SpringApplication.run(Application.class, args);
		long duration = System.currentTimeMillis() - startTime;
		System.out.println(":: Spring Boot :: DONE - " + LocalDateTime.now() + " - duration: " + duration + " ms");
	}
}
