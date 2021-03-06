package com.example.awesome_auctions.controllers;

import com.example.awesome_auctions.entities.Auction;
import com.example.awesome_auctions.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/api/v1/auction")
public class AuctionController {


    @Autowired
    AuctionService auctionService;

    @GetMapping
    public ResponseEntity<List<Auction>> findAuction(@RequestParam(required = false) String name) {
        System.out.println("INSIDE FIND UACTION");
        var auction = auctionService.findAll(name);
        return ResponseEntity.ok(auction);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auction> findAuctionById(@PathVariable String id) {

        System.out.println("FIND BY ID");
        return ResponseEntity.ok(auctionService.findById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Auction> saveAuction(@RequestBody Auction auction) {
        var savedAuction = auctionService.save(auction);
        return ResponseEntity.created(URI.create("/api/v1/auction/" + savedAuction.getId())).body(savedAuction);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAuction(@PathVariable String id, @RequestBody Auction auction) {
        auctionService.update(id, auction);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuction(@PathVariable String id) {
        auctionService.delete(id);
    }













}
