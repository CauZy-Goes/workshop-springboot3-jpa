package com.cauzy.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauzy.project.entities.Order;
import com.cauzy.project.repositories.OrderRepository;

@Service //diz que um coponente spring, assim o Autowired funciona
public class OrderService {
	
	@Autowired
	private OrderRepository repository; // jpaRepository já esta registrada
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //retorna o Order dentro do optional
	}
}
