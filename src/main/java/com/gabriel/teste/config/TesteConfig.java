package com.gabriel.teste.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabriel.teste.entities.User;
import com.gabriel.teste.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Fulano", "fulano@gmail.com", "9999999", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
