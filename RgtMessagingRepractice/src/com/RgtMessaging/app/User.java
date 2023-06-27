package com.RgtMessaging.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
	HashSet<User> followers;
	String userName;
	String password;
	String name;
	String bio;
	HashSet<User> followings;
	List<Tweet> tweets;
	
	
	
	public User(String userName, String password, String name, String bio) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.bio = bio;
		followers = new HashSet<>();
		followings = new HashSet<>();
		tweets = new ArrayList<>();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public HashSet<User> getFollowings() {
		return followings;
	}

	public void setFollowings(HashSet<User> followings) {
		this.followings = followings;
	}

	public HashSet<User> getFollowers() {
		return followers;
	}

	public void setFollowers(HashSet<User> followers) {
		this.followers = followers;
	}
	public void postTweet() {
		System.out.println("Please enter Your Tweet id");
		String id = sc.nextLine();
		System.out.println("Please enter your content");
		String content = sc.nextLine();
		Tweet tweet = new Tweet(id, content, userName, LocalDateTime.now());
		tweets.add(tweet);
		
	}
	public void deleteTweet() {
		System.out.println("Please enter your deleted tweet");
		String deleteTweet = sc.nextLine();
		
		Iterator<Tweet> it = tweets.iterator();	
		
		while(it.hasNext()) {
			Tweet	dt = it.next();
			if(dt.getContent().equals(deleteTweet)) {
				tweets.remove(dt);
			break;
			}
	}}
//		System.out.println("Please enter Your Tweet id");
//		String tweetId = sc.nextLine();
//		System.out.println("Please enter your content");
//		String content = sc.nextLine();
//		Tweet tweet = new Tweet(tweetId, content, userName, LocalDateTime.now());
//		tweets.remove(tweet);
//		}
//		
//		public void deleteTweetId(String tweetId) {
//			tweets.remove(tweetId);
//		}
//		
		
	
	public void follow(User currentUser) {
		if(!followers.contains(currentUser)) {
			followers.add(currentUser);
			currentUser.followings.add(this);
				
		}
	
	}
	public void following(User currentUser) {
		if(followers.contains(currentUser)) {
			followers.remove(currentUser);
			currentUser.followings.remove(this);
		}
		
	}
	public int getfollowcount() {
		return followers.size();
	}
	public int getfollowingcount() {
		return followings.size();
		
	}
	public List<Tweet> gettweets() {
		return tweets;
	}

}
