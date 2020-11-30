package com.example.awesome_auctions.controllers;

import com.example.awesome_auctions.entities.Auction;
import com.example.awesome_auctions.entities.Bid;
import com.example.awesome_auctions.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bid")
public class BidController {

    @Autowired
    private BidService bidService;


    @GetMapping
    public ResponseEntity<List<Bid>> findAll() {
        var bid = bidService.findAll();
        return ResponseEntity.ok(bid);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bid> findBidById(@PathVariable String id) {
        return ResponseEntity.ok(bidService.findById(id));
    }


    // TODO: VICTOR FIXA!!
    //@GetMapping
    //public ResonseE


    //@GetMapping()


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Secured("ROLE_USER")
    public ResponseEntity<Bid> saveBid(@RequestBody Bid bid) {
        var savedBid = bidService.save(bid);
        return ResponseEntity.created(URI.create("/api/v1/bid/" + savedBid.getId())).body(savedBid);
    }


    @PutMapping("/{id}")
    @Secured("ROLE_USER")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBid(@PathVariable String id, @RequestBody Bid bid) {
        bidService.update(id, bid);
    }


    @DeleteMapping("/{id}")
    @Secured("ROLE_ADMIN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBid(@PathVariable String id) {
        bidService.delete(id);
    }




}
