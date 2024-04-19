package com.cauzy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauzy.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
