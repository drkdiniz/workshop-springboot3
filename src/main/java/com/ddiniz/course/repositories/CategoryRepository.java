package com.ddiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddiniz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
