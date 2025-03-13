package com.vladmikhayl.jpa;

import com.github.javafaker.Faker;
import com.vladmikhayl.jpa.models.Author;
import com.vladmikhayl.jpa.models.recources.Video;
import com.vladmikhayl.jpa.repositories.AuthorRepository;
import com.vladmikhayl.jpa.repositories.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
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
			/*Author author = Author.builder()
					.firstName("Vlad")
					.lastName("Mikhaylov")
					.age(20)
					.email("vlad@yandex.ru")
					.build();
			authorRepository.save(author);*/

			Faker faker = new Faker();

			for (int i = 0; i < 50; i++) {
				Author author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19, 80))
						.email(faker.name().username() + "@yandex.ru")
						.build();
				authorRepository.save(author);
			}

			/*Author author = Author.builder()
					.id(1)
					.firstName("Vlad")
					.lastName("Mikhaylov")
					.age(20)
					.email("vlad@yandex.ru")
					.build();
			authorRepository.save(author);*/

//			authorRepository.updateAuthor(22, 1);

//			authorRepository.updateAllAuthorsAges(99);

			/*Video video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);*/

			/*List<Author> authorsByFirstName = authorRepository.findAllByFirstName("Billy");
			log.info("\nfindAllByFirstName: " + authorsByFirstName.get(0).getFirstName()
					+ " " + authorsByFirstName.get(0).getLastName());

			List<Author> authorsByFirstNameIgnoreCase = authorRepository.findAllByFirstNameIgnoreCase("billy");
			log.info("\nfindAllByFirstNameIgnoreCase: " + authorsByFirstNameIgnoreCase.get(0).getFirstName()
					+ " " + authorsByFirstNameIgnoreCase.get(0).getLastName());

			List<Author> authorsByFirstNameContainingIgnoreCase = authorRepository.findAllByFirstNameContainingIgnoreCase("nn");
			log.info("\nfindAllByFirstNameContainingIgnoreCase: " + authorsByFirstNameContainingIgnoreCase.get(0).getFirstName()
					+ " " + authorsByFirstNameContainingIgnoreCase.get(0).getLastName());

			List<Author> authorsByFirstNameEndsWithIgnoreCase = authorRepository.findAllByFirstNameEndsWithIgnoreCase("N");
			log.info("\nfindAllByFirstNameEndsWithIgnoreCase: " + authorsByFirstNameEndsWithIgnoreCase.get(0).getFirstName()
					+ " " + authorsByFirstNameEndsWithIgnoreCase.get(0).getLastName());*/

		};
	}

}
