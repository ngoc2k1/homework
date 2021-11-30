package org.aibles.userservice.service;

import org.aibles.userservice.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    User updateUser(User user, int id);

    void deleteUserById(int id);

    User partialUpdateAge(User user,int id);
}
