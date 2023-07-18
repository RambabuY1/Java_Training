package com.onlineBiddingSystem;

public interface BiddingStratagy {
	
	public double bid(Item item, User user, Double incrementalValue);

}
