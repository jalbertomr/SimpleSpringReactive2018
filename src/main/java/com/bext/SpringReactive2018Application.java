package com.bext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringReactive2018Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactive2018Application.class, args);
	}

	@Bean
	CommandLineRunner demo() {
		return args -> {
			Mono<String> miMono = Mono.just("Mono Maneja un Solo Dato");
			miMono.subscribe(System.out::println);
		};
	}
}
