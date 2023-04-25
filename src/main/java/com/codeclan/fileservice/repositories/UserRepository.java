package com.codeclan.fileservice.repositories;

import com.codeclan.fileservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
