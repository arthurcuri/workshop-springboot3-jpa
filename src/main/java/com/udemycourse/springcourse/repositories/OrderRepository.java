package com.udemycourse.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.springcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}