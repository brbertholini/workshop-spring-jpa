package com.brbertholini.springCourse.repositories;

import com.brbertholini.springCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
