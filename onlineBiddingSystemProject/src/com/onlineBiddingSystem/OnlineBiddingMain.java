package com.onlineBiddingSystem;

import java.util.Scanner;

public class OnlineBiddingMain {
	
	
	public static void main(String args[]) {
		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		UserManagementService um = new UserManagementService();
		ItemManagementService im = new ItemManagementService();
		while(exit) {
			
			System.out.println("1. create account");
			System.out.println("2. Add items");
			System.out.println("2. for login");
			System.out.println("3. exit");
			System.out.print("Choose an option :");
		int	choice  = sc.nextInt();
			switch(choice) {
			case 1:
				um.createUser();
			
			break;
			
			case 2:
				im.addItem();
				break;
				
			case 3:
				
				um.login();
				
		        break ;
			case 4:
				exit = false;
		   default:
				System.out.println("Invalid input!!");
			
			}
		
		}
	
  	}
	
}
