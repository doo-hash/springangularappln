package com.example.springwithangular.springangularappln;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springwithangular.springangularappln.model.User;
import com.example.springwithangular.springangularappln.repository.UserRepository;

@SpringBootApplication
public class SpringangularapplnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringangularapplnApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userrepo) {
		return args -> {
			Stream.of("Soujanya","Soumya","Vanaja").forEach(name -> {
				User user = new User(name,name.toLowerCase()+"@domain.com");
				userrepo.save(user);
			});
			userrepo.findAll().forEach(System.out::println);
		};
	}

}
