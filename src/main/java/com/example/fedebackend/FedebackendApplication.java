package com.example.fedebackend;

import com.example.fedebackend.model.patient;
import com.example.fedebackend.repositories.patientrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class FedebackendApplication {

	@Autowired
	patientrep rep ;

	public static void main(String[] args) {
		SpringApplication.run(FedebackendApplication.class, args);
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {

			        rep.save(new patient(1,3,150,0,2.3,0,0,1));
			        rep.save(new patient(1,3,150,0,2.3,0,0,1));
		};
	}


}