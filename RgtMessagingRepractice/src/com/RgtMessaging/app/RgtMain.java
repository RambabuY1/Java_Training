package com.RgtMessaging.app;

import java.util.Scanner;

public class RgtMain {

	public static void main(String args[]) {
		System.out.println("Welcome to RGTMessaging !!!\n");
		boolean exit = false;
		RgtMessaging rgt = new RgtMessaging();
		Scanner sc = new Scanner(System.in);
		while(!exit){
			
	    System.out.println("1. Register : ");
		System.out.println("2. Login : ");
		System.out.print("3. Exit : ");

		int userInput = sc.nextInt();

		switch (userInput) {
		
		case 1: 
			rgt.registerUser();
			
			break;
			
		case 2:
			
			rgt.login();
			
			break;
			
		case 3:
			
			exit = true;
			
			System.out.println("ThankYou good bye!!!!");
			
			break;
		case 4:
			rgt.getProfile();

		default:
			
			System.out.println("Invalid entries please enter correct input!!");
		}	
		}

	}
}
