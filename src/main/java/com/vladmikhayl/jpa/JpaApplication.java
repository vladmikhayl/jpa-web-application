package com.vladmikhayl.jpa;

import com.vladmikhayl.jpa.models.Author;
import com.vladmikhayl.jpa.models.recources.Video;
import com.vladmikhayl.jpa.repositories.AuthorRepository;
import com.vladmikhayl.jpa.repositories.VideoRepository;
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
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			Author author = Author.builder()
					.firstName("Vlad")
					.lastName("Mikhaylov")
					.age(20)
					.email("vlad@yandex.ru")
					.build();
			authorRepository.save(author);

			Video video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
