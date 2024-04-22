package com.cauzy.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cauzy.project.entities.User;
import com.cauzy.project.repositories.UserRepository;
import com.cauzy.project.services.exceptions.DatabaseException;
import com.cauzy.project.services.exceptions.ResourceNotFoundException;

@Service // diz que um coponente spring, assim o Autowired funciona
public class UserService {

	@Autowired
	private UserRepository repository; // jpaRepository já esta registrada

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); // retorna o User dentro do optional
	}

	public User insert(User obj) {
		return repository.save(obj);

	}

	public void delete(Long id) {
		try {
			if (!repository.existsById(id))
				throw new ResourceNotFoundException(id);
			repository.deleteById(id);
		} catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
