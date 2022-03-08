package com.example.capstone.controller;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Getter
@Setter
public class ItemForm {

    private Long id;
    private Long itemUserId;
    private String name;
    private String title;
    private int startBid;
    private int winningBid;
    private int unitBid;
    private String description;
    private String status;
    private Image[] images;
    private Long currentBidId;
    private int currentBid;
    private Timestamp startAuctionTime;
    private int auctionPeriod;

}
