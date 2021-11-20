package org.aibles.userservice.service;

import org.aibles.userservice.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getListUsers();

    User getUserById(int id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUserById(int id);

    void deleteListUsers();
}
