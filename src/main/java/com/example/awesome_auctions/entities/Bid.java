package com.example.awesome_auctions.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
public class Bid {

    @Id
    private String id;
    private String userID;
    private String auctionID;
    private double price;

    public Bid(String userID, String auctionID, double price) {
        this.userID = userID;
        this.auctionID = auctionID;
        this.price = price;
    }
}
