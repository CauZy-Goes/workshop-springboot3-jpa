package com.cauzy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauzy.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
