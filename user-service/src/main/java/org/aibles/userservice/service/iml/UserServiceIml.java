package org.aibles.userservice.service.iml;

import org.aibles.userservice.model.User;
import org.aibles.userservice.repository.UserRepository;
import org.aibles.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceIml(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getListUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public User createUser(User user) {
        User newUser=userRepository.save(user);
        return newUser;
    }

    @Override
    public User updateUser(User user) {
        User updateUser=userRepository.save(user);
        return updateUser;
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteListUsers() {
        userRepository.deleteAll();
    }
}



