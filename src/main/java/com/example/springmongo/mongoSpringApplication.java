package com.example.springmongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class mongoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(mongoSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
		return args -> {
			Student student = new Student(
					"Dave",
					"Presston",
					"dave@davsdfgep.com"
			);
			repository.findStudentByEmail("dave.davep.com")
					.ifPresentOrElse(s -> {
						System.out.println("exists");
					}, () -> {
						System.out.println("inserting");
						repository.insert(student);
					});
		};
	}
}

