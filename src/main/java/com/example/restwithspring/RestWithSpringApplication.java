package com.example.restwithspring;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.model.Users;
import com.example.restwithspring.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class RestWithSpringApplication {

	@Autowired
	UsersRepository usersRepository;
	public static void main(String[] args) {
		SpringApplication.run(RestWithSpringApplication.class, args);
	}

}
