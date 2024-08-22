package com.udemycourse.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}