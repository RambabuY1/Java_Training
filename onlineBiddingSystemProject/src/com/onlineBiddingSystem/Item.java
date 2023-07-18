package com.onlineBiddingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Item {
	
	private String name;
    private String description;
    private double currentHighestBid;
    private User highestBidder;
    private List<Bid> bids;
    private List<Observer> observers;
	public Item(String name, String description, double currentHighestBid) {
		
		this.name = name;
		this.description = description;
		this.currentHighestBid = currentHighestBid;
		bids = new ArrayList<>();
		observers = new ArrayList<>();
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public void placeBid(User user, double bidAmount) {
        if (bidAmount > currentHighestBid) {
            currentHighestBid = bidAmount;
            highestBidder = user;
        }
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getDescription() {
		return description;
	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	public User getHighestBidder() {
		return highestBidder;
	}
	public void setHighestBidder(User highestBidder) {
		this.highestBidder = highestBidder;
	}
//	public void setCurrentHighestBid(double currentHighestBid) {
//		this.currentHighestBid = currentHighestBid;
//	}
	public double getCurrentHighestBid() {
		
		return currentHighestBid;
	}
	public void notifyObservers(Item item) {
		// TODO Auto-generated method stub
		
	}
	public List<Bid> getBids() {
		
		return bids;
	}
	
	public void setbids(Bid bid) {
		bids.add(bid);
	}
	
//	public String toString() {
//		return "Name: "+name+"  Description:  "+description+"    CurrentHighestBid: "+currentHighestBid;
//		
//	}
}
