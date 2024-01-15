package com.gabriel.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.teste.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
