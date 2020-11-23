package com.example.awesome_auctions.services;

import com.example.awesome_auctions.entities.Auction;
import com.example.awesome_auctions.repositories.AuctionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuctionService {


    @Autowired
    private AuctionRepo auctionRepo;



    public List<Auction> findAll(String name) {
        return auctionRepo.findAll();
        //return auctionRepo.findByProductNameContains(name);
    }


    public Auction findById(String id) {
        return auctionRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found by id"));
    }



    public Auction save(Auction auction) {
        return auctionRepo.save(auction);
    }



    public void update(String id, Auction auction) {
        if (!auctionRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found");
        }
        auction.setId(id);
        auctionRepo.save(auction);
    }


    public void delete(String id) {
        if (!auctionRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found");
        }
        auctionRepo.deleteById(id);
    }

}
