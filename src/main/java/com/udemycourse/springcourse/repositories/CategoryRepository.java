package com.udemycourse.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.springcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}