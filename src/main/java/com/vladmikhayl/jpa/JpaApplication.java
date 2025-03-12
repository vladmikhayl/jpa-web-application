package com.vladmikhayl.jpa;

import com.vladmikhayl.jpa.models.Author;
import com.vladmikhayl.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
			Author author = Author.builder()
					.firstName("Vlad")
					.lastName("Mikhaylov")
					.age(20)
					.email("vlad@yandex.ru")
					.build();
			repository.save(author);
		};
	}

}
