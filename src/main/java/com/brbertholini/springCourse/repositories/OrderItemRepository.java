package com.brbertholini.springCourse.repositories;

import com.brbertholini.springCourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
