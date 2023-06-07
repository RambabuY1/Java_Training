package com.SecondAssignment_Ratna;

import java.util.Scanner;

public class User_Class {
	
		public static void main(String args[]) {
			
			Book_Library_Class n=new Book_Library_Class();
				Scanner sc = new Scanner(System.in);
				
				int choice;
				
				do {
				System.out.println("1. Add Book");
				System.out.println("2. Add Patron");
				System.out.println("3. Borrow Book");
				System.out.println("4. Return Book");
				System.out.println("5. Book Availability");
				System.out.println("6. Borrowed Books by Patron");
				System.out.println("0. Exit");
				System.out.print("Enter your choice: ");
				 choice =sc.nextInt();
				switch(choice) {
				case 1:
					
					n.addbooks();
					
			            break;
				case 2:
					
					 n.addPatron();
					
				       	break;
				case 3:
					
					n.borrowBook();
					
				        break;
				case 4:
					n.returnbook();
					
					break;
				case 0:
					
					System.out.println("Thanks you Read more books increment your knowledge !!!!");
					
				}
				
				}
				while(choice!=0);
				}
			
			
}
