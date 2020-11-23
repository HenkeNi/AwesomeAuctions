package com.example.awesome_auctions.repositories;

import com.example.awesome_auctions.entities.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuctionRepo extends MongoRepository<Auction, String> {

    List<Auction> findByProductNameContains(String productName);
    List<Auction> findByProductName(String productName);

    //Optional<Auction> findById(String id);

}
