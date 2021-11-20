package org.aibles.userservice.controller;

import org.aibles.userservice.model.User;
import org.aibles.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-id{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        if (user != null) return ResponseEntity.ok(user);
        return new ResponseEntity<>("User isn't exist. Please try again with other Id", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/get-list-users")
    public ResponseEntity<?> getListUsers() {
        List<User> result = userService.getListUsers();
        return ResponseEntity.ok(result);
    }
    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        User newUser= userService.getUserById(user.getId());
        if(newUser!=null)
            return new ResponseEntity<>("User is exist. Please try again with other Id", HttpStatus.NOT_ACCEPTABLE);
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/update-user")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return ResponseEntity.ok(user);
    }
    @DeleteMapping("/delete-id{id}")
    public ResponseEntity<?> deleteUser(@PathVariable ("id")int id){
        User deleteUser=userService.getUserById(id);
        if(deleteUser==null) return new ResponseEntity<>("User isn't exist. Please try again with other Id", HttpStatus.NOT_FOUND);
        userService.deleteUserById(id);
        return ResponseEntity.ok(deleteUser);
    }
    @DeleteMapping("/delete-list-users")
    public ResponseEntity<?> deleteListUsers(){
        userService.deleteListUsers();
        return new ResponseEntity<>("Delete succeeds", HttpStatus.OK);
    }
}
