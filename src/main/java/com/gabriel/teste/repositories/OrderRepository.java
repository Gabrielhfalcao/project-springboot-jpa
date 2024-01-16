package com.gabriel.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.teste.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
