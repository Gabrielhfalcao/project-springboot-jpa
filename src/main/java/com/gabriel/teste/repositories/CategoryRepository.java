package com.gabriel.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.teste.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
