package com.gabriel.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.teste.entities.OrderItem;
import com.gabriel.teste.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll(){
		return orderItemRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> orderItem = orderItemRepository.findById(id);
		return orderItem.get();
	}
	
}
