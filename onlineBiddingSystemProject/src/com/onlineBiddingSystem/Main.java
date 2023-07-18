package com.onlineBiddingSystem;

import java.util.Scanner;

public class Main {
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) 
			
		
		{
		System.out.println("1. create Account");
		System.out.println("2. Login");
		System.out.print("3. Exit : ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
		
			break;
		case 2:
			System.out.println();
			
			break;
		case 3:
			
			exit = true;
			System.out.println();
			
			break;
		default :
				System.out.println();
		}
		}
	}

}
