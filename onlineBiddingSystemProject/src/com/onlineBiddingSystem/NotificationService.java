package com.onlineBiddingSystem;

public class NotificationService {
	public void notifyUser(User user, Item item) {
       UserObserve userobserve = new UserObserve(user);
       userobserve.update(item);
    }
}
