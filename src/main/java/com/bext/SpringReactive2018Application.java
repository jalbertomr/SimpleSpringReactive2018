package com.bext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringReactive2018Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactive2018Application.class, args);
	}

	@Bean
	CommandLineRunner demo() {
		return args -> {
			Flux<String> miFlux = Flux.fromArray("1,2,3,4,5,6".split(","));
			miFlux.map(Integer::parseInt)
                    .filter(i -> i % 2 == 0)
                    .subscribe(System.out::println, null, null);
		};
	}
}
