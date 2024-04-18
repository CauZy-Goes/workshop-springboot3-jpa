package com.cauzy.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauzy.project.entities.User;
import com.cauzy.project.repositories.UserRepository;

@Service //diz que um coponente spring, assim o Autowired funciona
public class UserService {
	
	@Autowired
	private UserRepository repository; // jpaRepository já esta registrada
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); //retorna o User dentro do optional
	}
}
