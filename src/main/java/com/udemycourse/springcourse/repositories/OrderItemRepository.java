package com.udemycourse.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.springcourse.entities.OrderItem;
import com.udemycourse.springcourse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
