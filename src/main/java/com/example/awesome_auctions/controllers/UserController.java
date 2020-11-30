package com.example.awesome_auctions.controllers;


import com.example.awesome_auctions.entities.User;
import com.example.awesome_auctions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    @Autowired
    UserService userService;


    @GetMapping
    @Secured({"ROLE_USER", "ROLE,ADMIN"})
    public ResponseEntity<List<User>> findUser(@RequestParam(required = false) String name) {
        var user = userService.findAll();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    @Secured({"ROLE_EDITOR", "ROLE_ADMIN"})
    public ResponseEntity<User> findUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.findById(id));
    }
    
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Secured("ROLE_ADMIN")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        var savedUser = userService.save(user);
        return ResponseEntity.created(URI.create("/api/v1/user/" + savedUser.getId())).body(savedUser);
    }


    @PutMapping("/{id}")
    @Secured({"ROLE_EDITOR", "ROLE_ADMIN", "ROLE_USER"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        userService.update(id, user);
    }


    @DeleteMapping("/{id}")
    @Secured("ROLE_ADMIN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }



}
