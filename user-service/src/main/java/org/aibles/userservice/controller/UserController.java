package org.aibles.userservice.controller;

import org.aibles.userservice.model.User;
import org.aibles.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        if (user != null) return new ResponseEntity<>(user, HttpStatus.OK);
        else return new ResponseEntity<>("ID not found. Please try again with other Id.", HttpStatus.NOT_FOUND);
    }

    @GetMapping()
    public ResponseEntity<?> getUsers() {
        List<User> result = userService.getAllUsers();
        return ResponseEntity.ok(result);
    }

    @PostMapping() //cứ call post là 200-201
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);

        //return ResponseEntity.ok(user);
        //return ResponseEntity.status(HttpStatus.OK).body(user);

    }

    @PutMapping("/{id}")//truyền ID lên backend -> vào db để check[tồn tại 200, k tồn tại 404 not found], còn 400??
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody User userUpdated) {
        User user = userService.getUserById(id);
        if (user == null) {
            return new ResponseEntity<>("Check again input", HttpStatus.BAD_REQUEST);
        } else {
            if (user.getId() == userUpdated.getId()) {
                userService.updateUser(userUpdated, userUpdated.getId());
                return new ResponseEntity<>(userUpdated, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("ID not found. Please try again with other Id.", HttpStatus.NOT_FOUND);
            }
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
        User deleteUser = userService.getUserById(id);
        if (deleteUser == null)
            return new ResponseEntity<>("ID not found. Please try again with other Id.", HttpStatus.NOT_FOUND);
        else {
            userService.deleteUserById(id);
            return new ResponseEntity<>(deleteUser, HttpStatus.OK);
        }
    }
}
