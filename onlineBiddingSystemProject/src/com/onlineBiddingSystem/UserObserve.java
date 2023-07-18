package com.onlineBiddingSystem;

import java.util.Observable;
import java.util.Observer;

public class UserObserve implements Observer{
	private User user;

	 

    public UserObserve(User user) {
        this.user = user;
    }


	@Override
	public void update(Observable o, Object arg) {
		
		
	}


	public void update(Item item) {
		// TODO Auto-generated method stub
		
	}

}
