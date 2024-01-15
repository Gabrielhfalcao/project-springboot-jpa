package com.gabriel.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.teste.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> getAll(){
		User user = new User(1L, "Gabriel", "gabriel@gmail.com", "99999998", "12345");
		return ResponseEntity.ok().body(user);
	}
}
