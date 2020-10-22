package de.mokkapps.custommetricsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CustomMetricsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomMetricsDemoApplication.class, args);
	}

}
