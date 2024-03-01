package com.brbertholini.springCourse.repositories;

import com.brbertholini.springCourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
