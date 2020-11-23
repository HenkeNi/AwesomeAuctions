package com.example.awesome_auctions.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;



@Data
@NoArgsConstructor
public class Auction {

    @Id
    private String id;
    private String productName;
    private String description;
    private String imageURL;
    private double startBid;
    private long endDate;

    public Auction(String productName, String description, String imageURL, double startBid, long endDate) {
        this.productName = productName;
        this.description = description;
        this.imageURL = imageURL;
        this.startBid = startBid;
        this.endDate = endDate;
    }
}
