package com.cauzy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauzy.project.entities.OrderItem;
import com.cauzy.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
