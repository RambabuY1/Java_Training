package com.onlineBiddingSystem;

public class IncrementalBiddingStratagy implements BiddingStratagy {

	public IncrementalBiddingStratagy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bid(Item item, User user, Double bidAmoun) {
		double currentBid = item.getCurrentHighestBid();
        double newBid = currentBid + 1.0;
        item.placeBid(user, newBid);
        item.notifyObservers(item);
        Bid bid=new Bid(item, user, newBid, false);
        item.setbids(bid);
        return newBid;
		
	}

}
