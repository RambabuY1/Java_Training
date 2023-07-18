package com.onlineBiddingSystem;

public class AutomaticBiddingStratagy implements BiddingStratagy{

	
	
private double maxBidAmount;
	
	private double incrementValue;
	
	Item item = new Item();
	
	public AutomaticBiddingStratagy(double maxBidAmount, double incrementValue) {
		super();
		this.maxBidAmount = maxBidAmount;
		this.incrementValue = incrementValue;
	}


	public AutomaticBiddingStratagy() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public double bid(Item item, User user, Double bidAmount) {
		
		  double currentBid = item.getCurrentHighestBid();
	        double newBidAmount = currentBid + incrementValue; 
	    	if (newBidAmount <= maxBidAmount) {
	            item.placeBid(user, newBidAmount);
	            currentBid = newBidAmount;
	            newBidAmount += incrementValue;
	        }
	    	item.notifyObservers(item);
	        return newBidAmount;
	
	}

	

}
