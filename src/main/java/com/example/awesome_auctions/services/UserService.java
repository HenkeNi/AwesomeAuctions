package com.example.awesome_auctions.services;

import com.example.awesome_auctions.entities.Auction;
import com.example.awesome_auctions.entities.User;
import com.example.awesome_auctions.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> findAll() {
        return userRepo.findAll();
    }


    public User findById(String id) {
        return userRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found by id"));
    }



    public User save(User user) {
        return userRepo.save(user);
    }



    public void update(String id, User user) {
        if (!userRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        user.setId(id);
        userRepo.save(user);
    }


    public void delete(String id) {
        if (!userRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        userRepo.deleteById(id);
    }

}
