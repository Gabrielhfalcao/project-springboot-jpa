package com.gabriel.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
