package com.finalproject.bidmeauction;

import java.util.Date;

/**
 * Created by RAIIKA on 10/12/2017.
 */

public class Blog {

    private String title, desc, image, username, bidname, auction_id;

    private long waktu;

    private double bid;

    public Blog(){

    }

    public Blog(String title, String desc, String image, String username, String bidname, long waktu, double bid, String auction_id) {
        this.title = title;
        this.desc = desc;
        this.image = image;
        this.username = username;
        this.bidname = bidname;
        this.waktu = waktu;
        this.bid = bid;
        this.auction_id = auction_id;
    }

    public String getAuction_id() {
        return auction_id;
    }

    public void setAuction_id(String auction_id) {
        this.auction_id = auction_id;
    }

    public String getBidname() {
        return bidname;
    }

    public void setBidname(String bidname) {
        this.bidname = bidname;
    }

    public long getWaktu() {
        return waktu;
    }

    public void setWaktu(long waktu) {
        this.waktu = waktu;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
