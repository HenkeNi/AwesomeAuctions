package com.example.awesome_auctions.controllers;


import com.example.awesome_auctions.entities.User;
import com.example.awesome_auctions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.URI;
import java.util.List;

import static org.springframework.security.web.context.HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    @Autowired
    UserService userService;

    @Resource(name="authenticationManager")
    private AuthenticationManager authManager;

    @GetMapping
    public ResponseEntity<List<User>> findUser(@RequestParam(required = false) String name) {
        var user = userService.findAll();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        var savedUser = userService.save(user);
        return ResponseEntity.created(URI.create("/api/v1/user/" + savedUser.getId())).body(savedUser);
    }

    @PostMapping("/login")
    private ResponseEntity<User> securityLogin(String email, String password, HttpServletRequest req) {
        UsernamePasswordAuthenticationToken authReq
                = new UsernamePasswordAuthenticationToken(email, password);
        Authentication auth = authManager.authenticate(authReq);

        if(!auth.isAuthenticated()) {
            throw new BadCredentialsException("Wrong username or password");
        }

        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(auth);
        HttpSession session = req.getSession(true);
        session.setAttribute(SPRING_SECURITY_CONTEXT_KEY, sc);

        return ResponseEntity.ok(userService.findCurrentUser());
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        userService.update(id, user);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }


}
