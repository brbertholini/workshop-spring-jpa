package com.brbertholini.springCourse.repositories;

import com.brbertholini.springCourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
