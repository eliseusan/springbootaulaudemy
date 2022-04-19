package com.springestudos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
