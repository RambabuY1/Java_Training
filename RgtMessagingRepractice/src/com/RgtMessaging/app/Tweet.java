package com.RgtMessaging.app;

import java.time.LocalDateTime;

public class Tweet {
	String id;
	String content;
	String author;
	LocalDateTime timeStamp;
	

public Tweet(String id, String content, String author, LocalDateTime timeStamp ) {
	super();
	this.id = id;
	this.content = content;
	this.author = author;
	this.timeStamp = timeStamp;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getContent() {
	return content;
}


public void setContent(String content) {
	this.content = content;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public LocalDateTime getTimeStamp() {
	return timeStamp;
}


public void setTimeStamp(LocalDateTime timeStamp) {
	this.timeStamp = timeStamp;
}	



}
