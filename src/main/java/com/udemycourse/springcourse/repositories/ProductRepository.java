package com.udemycourse.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.springcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}