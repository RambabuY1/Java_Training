package com.SecondAssignment_Ratna;

import java.util.Scanner;

public class Book_Library_Class {

	private static final int MAX_BOOKS = 10; // Maximum number of books in the library

	private static final int MAX_PATRONS = 5; // Maximum number of patrons in the library

     private int borrowedCount;

	private String[] books; // Array to store book titles;//String[] books

	private boolean[] borrowed; // Array to track book availability

	private String[] patrons; // Array to store patron names

	private int[][] borrowedBooks; // 2D array to track borrowed books by patrons

	private int bookCount; // Current number of books in the library

	private int patronCount; // Current number of patrons in the library

	Scanner sc =new Scanner(System.in);

	public Book_Library_Class() {

		books = new String[MAX_BOOKS];//String[] books=new String[MAX_BOOKS]

		borrowed = new boolean[MAX_BOOKS];

		patrons = new String[MAX_PATRONS];

		borrowedBooks = new int[MAX_PATRONS][MAX_BOOKS];

		bookCount = 0;

		patronCount = 0;
		borrowedCount = 0;
	}
	public void addbooks() {
		System.out.print("Enter book Name :");
		String booktitle = sc.next();
		System.out.print("Enter author Name :");
		String author = sc.next();
		if(bookCount<MAX_BOOKS) {
			
			books[bookCount] = booktitle;
			
			books[bookCount] = author;
			borrowed[borrowedCount] = false;

			bookCount++;
			borrowedCount++;
			System.out.println("Book added successfully.");

		} else {

			System.out.println("oops!! Maximum book limit reached.");
		}
	}
	public void addPatron() {
		System.out.print("Enter Patron Name");
		String patronname = sc.next();
		if(patronCount < MAX_PATRONS) {
			patrons[patronCount] = patronname;

			System.out.println("Patron Added Successfully");
			patronCount++;
		}
		else {
			System.out.println("oops!! patrons Size Reached");
		}
	}
	public void borrowBook() {
		
		System.out.print("Enter Book Index : ");	
		int patronIndex = sc.nextInt();
		System.out.print("Enter Patron Index : ");
		int bookIndex = sc.nextInt();


		if (patronIndex >= 0 && patronIndex < patronCount && bookIndex >= 0 && bookIndex < bookCount) {

			if (!borrowed[bookIndex]) {

				borrowed[bookIndex] = true;

				borrowedBooks[patronIndex][bookIndex] = 1;

				System.out.println("Book borrowed successfully.");

			} 
			else
			{
				System.out.println("Book already borrowed.");

			}
		} 
		else {

			System.out.println("Invalid patron or book index.");

		}
		}
		public void returnbook() {
			
			System.out.print("Enter Book Index : ");	
			int patronIndex = sc.nextInt();
			
			System.out.print("Enter Patron Index : ");
			
			int bookIndex = sc.nextInt();
		if(	bookIndex >= 0 && bookCount > bookIndex && patronCount > patronIndex && patronIndex >= 0) {
		   if(borrowed[bookIndex]) {
			   borrowed[bookIndex] = false;
			   borrowedBooks[patronIndex][bookIndex] = 0;
			   System.out.println("Book Returned Successfully");
		   }
		   else {
			   System.out.println("Book not returned");
		   }
			
		}
		else {
			System.out.println("Invalid patronIndex or bookIndex");
		}
		}
		

	


}
