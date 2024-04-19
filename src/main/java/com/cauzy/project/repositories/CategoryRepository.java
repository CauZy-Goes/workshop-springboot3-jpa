package com.cauzy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauzy.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
