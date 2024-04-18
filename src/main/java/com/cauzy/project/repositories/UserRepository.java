package com.cauzy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauzy.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
