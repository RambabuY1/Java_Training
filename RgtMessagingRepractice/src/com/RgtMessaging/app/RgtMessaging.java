package com.RgtMessaging.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RgtMessaging {
	Scanner sc = new Scanner(System.in);
	Map<String, User>users;
	User currentUser;
	String userName;
	User user;
	public RgtMessaging() {
		users  = new HashMap<>();
		currentUser = null;
	
	}
	
	public void registerUser() {
		
		System.out.println("Enter userName");
		userName =sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("enter bio");
		String bio = sc.next();
		user = new User(userName, password, name, bio);
		
		if(user!=null&&users.containsKey(userName)) {
			System.out.println("User already registered!!");
		}
		else {
			users.put(userName, user);
			System.out.println("You are registered successfully");
		}
		
	
	}
	public void login() {
		System.out.println("Enter user name");
		String userName = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		User user = users.get(userName);
		    currentUser = user;
		if(user!=null&&user.getPassword().equals(password)) {
			System.out.println("Login successfully!!!");
			
			System.out.println("Welcome to ["+users.get(userName).getUserName()+"]!!\n");
			boolean	logout = false;
			while(!logout) {
				
			
			System.out.println("1. Post a tweet");
			System.out.println("2. Search for users");
			System.out.println("3. View your profile");
			System.out.println("4. Logout\n");
			System.out.print("Please enter your choice : ");

             int userinput = sc.nextInt();
		
			
			switch(userinput) {
			
			case 1:
				user.postTweet();
				break;
			case 2:
				searchUser();
				break;
			case 3:
				getProfile();
				break;
			case 4:
			logout = true;
				break;
			case 5:
			 user.deleteTweet();
			 break;
			 default :
				 System.out.println("Input Mismatched please try again");
				 break;
			}
			}
		}
		else {
			System.out.println("Invalid Password or Username please try again!!");
		}
	
	}
	
	public void getProfile() {
		System.out.println("Your Name is : "+currentUser.getUserName());
		System.out.println("Your Name is : "+currentUser.getName());
		System.out.println("Your Followers are : "+currentUser.getFollowers());
		System.out.println("Your Follwings are : "+currentUser.getfollowingcount());
		System.out.println("Your Bio is : "+currentUser.getBio());
            for (Tweet tweett : currentUser.gettweets()) {
			
			System.out.println("Your Tweets :"+tweett.getContent()+"\n");
			
		}
	
	}
	public void searchUser() {
		System.out.print("Please enter User name :");
	String	searchUser = sc.next();
	
	if(searchUser!=null&&users.containsKey(searchUser)) {
	
		System.out.println("Your Search user Name is : "+users.get(searchUser).getUserName());
		System.out.println("Your Search user Name :"+users.get(searchUser).getName());
		System.out.println("Your Search user Bio :"+users.get(searchUser).getBio());
		System.out.println("Your Search User Followers :"+users.get(searchUser).getfollowcount());
		System.out.println("Your Search User Followings :"+users.get(searchUser).getFollowings()+"\n");
		   
		 boolean  exit =false;
		 while(!exit)
		 {
		   System.out.println("1. For follow");
		   System.out.println("2. For unfollow");
		   System.out.println("3. for exit");
		   
		   System.out.print("Please enter your choice : ");
		
		int   choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			user.follow(currentUser);
		    break;
		case 2:
			user.following(currentUser);
		    break;
		case 3:
			exit = true;
			break;
		default :
			System.out.println("Input Mismatched please try again!!");
			
		}
		
		 }
	
	}
	else {
		System.out.println("User does not exist with that name");
	}
	}

}
