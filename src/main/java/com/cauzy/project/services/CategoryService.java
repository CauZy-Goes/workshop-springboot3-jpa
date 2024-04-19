package com.cauzy.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauzy.project.entities.Category;
import com.cauzy.project.repositories.CategoryRepository;

@Service //diz que um coponente spring, assim o Autowired funciona
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; // jpaRepository já esta registrada
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //retorna o Category dentro do optional
	}
}
