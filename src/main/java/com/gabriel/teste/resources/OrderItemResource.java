package com.gabriel.teste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.teste.entities.OrderItem;
import com.gabriel.teste.services.OrderItemService;

@RestController
@RequestMapping(value = "/orderitems")
public class OrderItemResource {
	
	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		List<OrderItem> items = orderItemService.findAll();
		return ResponseEntity.ok().body(items);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id){
		OrderItem item = orderItemService.findById(id);
		return ResponseEntity.ok().body(item);
	}
	
}
