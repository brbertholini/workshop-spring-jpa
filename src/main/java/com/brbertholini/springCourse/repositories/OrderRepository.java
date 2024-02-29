package com.brbertholini.springCourse.repositories;

import com.brbertholini.springCourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
