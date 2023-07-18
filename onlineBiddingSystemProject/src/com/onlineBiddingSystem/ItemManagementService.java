package com.onlineBiddingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManagementService {
     Scanner sc = new Scanner(System.in);
	private Auction auction;

	 

    public ItemManagementService() {
        auction = Auction.getInstance();
    }

 

    public void addItem(String name, String description, double startingBid) {
        Item item = ItemFactory.createItem(name, description, startingBid);
        auction.addItem(item);
    }

 

    public List<Item> searchItems(String keyword) {
    List<Item> items = new ArrayList<>(); 
    for (Item item : auction.getItem()) {
    	if(item.getName().equalsIgnoreCase(keyword)) {
    		items.add(item);
    	}
	}
    
        return items;
    }
    public void addItem() {
    	System.out.println("Enter the ItemName");
    	String Itemname = sc.next();
    	System.out.println("Enter item Description");
    	String description = sc.next();
    	System.out.println("Enter starting Bid");
    	double startingBid =sc.nextDouble();
    	addItem(Itemname, description, startingBid);
    	System.out.println("Item added successfully");
    	
    	
    }
    public List<Bid> viewBiddingHistory(User user) {
        List<Bid> biddingHistory = new ArrayList<>();
        for (Item item : auction.getItem()) {
            List<Bid> itemBids = item.getBids();
            for (Bid bid : itemBids) {
                if (bid.getBidder().equals(user)) {
                    biddingHistory.add(bid);
                }
            }
        }
        return biddingHistory;
    }
   
}

