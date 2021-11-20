package org.aibles.userservice.repository;

import org.aibles.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> { //Integer khóa chính
}

