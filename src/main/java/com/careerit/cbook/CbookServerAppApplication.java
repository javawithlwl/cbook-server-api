package com.careerit.cbook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CbookServerAppApplication  {

	@Value("${greetings}")
	private String greetings;
	public static void main(String[] args) {
		SpringApplication.run(CbookServerAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
			System.out.println("Greetings : "+greetings);
		};
	}
}
