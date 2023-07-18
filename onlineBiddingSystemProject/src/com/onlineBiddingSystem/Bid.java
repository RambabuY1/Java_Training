package com.onlineBiddingSystem;

public class Bid {

	private Item item;
    private User bidder;
    private double amount;
    private boolean winningBid;
	
	
	
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}



	public Bid(Item item, User bidder, double amount, boolean winningBid) {
		//super();
		this.item = item;
		this.bidder = bidder;
		this.amount = amount;
		this.winningBid = winningBid;
	}



	public User getBidder() {
		return bidder;
	}



	public void setBidder(User bidder) {
		this.bidder = bidder;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public boolean isWinningBid() {
		return winningBid;
	}



	public void setWinningBid(boolean winningBid) {
		this.winningBid = winningBid;
	}



	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
