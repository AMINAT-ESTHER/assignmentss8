package com.library.library.System;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibrarySystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(libraryService libraryService){
		return args -> {
			System.out.println("  Starting library System");
			libraryService.getBookDetails(100);
			System.out.println("  System Finished");
		};
	}
}
