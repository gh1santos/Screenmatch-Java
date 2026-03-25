package com.example.java_screenmatch_web;

import com.example.java_screenmatch_web.principal.Principal;
import com.example.java_screenmatch_web.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaScreenmatchWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaScreenmatchWebApplication.class, args);
	}
}
