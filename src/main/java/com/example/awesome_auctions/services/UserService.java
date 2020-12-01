package com.example.awesome_auctions.services;

import com.example.awesome_auctions.entities.Auction;
import com.example.awesome_auctions.entities.User;
import com.example.awesome_auctions.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> findAll() {
        return userRepo.findAll();
    }


    public User findById(String id) {
        return userRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found by id"));
    }

    public User findByName(String name) {
        return userRepo.findByName(name).orElseThrow(RuntimeException::new);
    }

    public User save(User user) {
        return userRepo.save(user);
    }



    public void update(String id, User user) {
        var currentUser = findByName(myUserDetailsService.getCurrentUser());
        if (!userRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        if(sameUserOrAdminOrEditor(currentUser, id)) {
            user.setId(id);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepo.save(user);
        }
        else throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "You can not update this user");
    }


    public void delete(String id) {
        if (!userRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        userRepo.deleteById(id);
    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public User findCurrentUser() {
        // the login session is stored between page reloads,
        // and we can access the current authenticated user with this
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepo.findByEmail(email);
    }
}
