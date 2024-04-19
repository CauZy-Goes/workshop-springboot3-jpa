package com.cauzy.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauzy.project.entities.Product;
import com.cauzy.project.repositories.ProductRepository;

@Service //diz que um coponente spring, assim o Autowired funciona
public class ProductService {
	
	@Autowired
	private ProductRepository repository; // jpaRepository já esta registrada
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get(); //retorna o Product dentro do optional
	}
}
