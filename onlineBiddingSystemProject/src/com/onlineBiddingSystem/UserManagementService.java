package com.onlineBiddingSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserManagementService {
	private List<User> users;
	Scanner sc = new Scanner(System.in);
    ItemManagementService itemManagementService= new ItemManagementService();
    
	public UserManagementService() {
		users = new ArrayList<>();
	}

	public void createUser() {
		
		System.out.println("Enter your Name");
		String username = sc.next();
		System.out.println("Enter your Password");
		String password = sc.next();
		User user = new User(username, password);
		if (users.isEmpty() || !(userexist(username))) {
			users.add(user);
			System.out.println("You are registered successfully");
		} else {
			System.out.println("User already exist!!");
		}

	}

	public boolean userexist(String username) {

		Iterator<User> it = users.iterator();

		while (it.hasNext()) {

			if (it.next().getUsername().equalsIgnoreCase(username)) {

				return true;

			}

		}

		return false;

	}


	public User authenticateUser(String username, String password) {

		for (User user2 : users) {
			if (user2.getUsername().equals(username) && user2.getPassword().equals(password)) {
				return user2;
			}
		}

		return null;

	}
	public void login() {
		System.out.println("Enter your Name");
		String username = sc.next();
		System.out.println("Enter your Password");
		String password = sc.next();
		User user = authenticateUser(username,password);
		if(user!=null) {
			boolean exit = false;
			while(!exit) {
				System.out.println("1. Search Items");
				System.out.println("2. View Bidding History");
				System.out.println("3. exit");
				System.out.print("Choose an option :");
			int	choice  = sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.print("enter a search keyword :");
					String keyword = sc.next();  
				List<Item> items = itemManagementService.searchItems(keyword);	
				for (Item item : items) {
					int num=1;
			    	System.out.println(num+"."+item.getName()+"\n"+item.getDescription()+"\n"+item.getCurrentHighestBid());
					
					num++;
				}
				System.out.print("Enter an item name to place a bid : ");
				
				String biditemname = sc.next();
				
			    System.out.print("enter bid amount: ");
			    
					double bidAmount =sc.nextDouble();
					System.out.println("1. incremental bidding");
					System.out.println("2. Automatic bidding");
				int	stratagyoption = sc.nextInt();
				BiddingStratagy biddingStrategy;
				if(stratagyoption==1) {
					
					biddingStrategy = new IncrementalBiddingStratagy();
				}
					else {
						biddingStrategy = new AutomaticBiddingStratagy();
					}
					
					Item selectedItem = null;
					
					for (Item item : items) {
						if(item.getName().equalsIgnoreCase(biditemname)) {
							selectedItem = item;
							 break;
						}
						
					}
					if(selectedItem!=null) {
						
						double newBidAmount = biddingStrategy.bid(selectedItem, user, bidAmount);
						
						System.out.println("Bid placed successfully "+newBidAmount);
						
					}
					else {
						System.out.println("item not found");
					}
					break;
				case 2:
					List<Bid> biddingHistory = itemManagementService.viewBiddingHistory(user);
					System.out.println("\nYour bidding history:");
					int historyIndex = 1;
					for (Bid bid : biddingHistory) {
						System.out.println(historyIndex + ". " + bid.getItem().getName() + " - "
								+ bid.getItem().getDescription() + " - Bid amount: Rs " + bid.getAmount()
								+ " - Winning bid: " + bid.isWinningBid());
						historyIndex++;
					}
					break;
				
			  default:
				  
					System.out.println("Invalid input!!  ");
				
				}
			
			}
		}else {
			System.out.println("Invali username or password");
		}
	
	}
	
}

