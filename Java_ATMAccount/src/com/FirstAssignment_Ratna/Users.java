package com.FirstAssignment_Ratna;

import java.util.Scanner;

public class Users {
	public static void main(String[] args) 
	{
		Creation_New_Account_Class ac_process = new Creation_New_Account_Class();
		Scanner sc = new Scanner(System.in);
		Accounts currentAccount=null;
		int choice = 0;

		do
		{
			if(currentAccount==null)
			{
				System.out.println("Welcome to the ATM");
				System.out.println("1.create account");
				System.out.println("2. login");
				System.out.println("3.exit");
				System.out.println("choose an option: ");
				choice = sc.nextInt();

				switch(choice)
				{
				case 1:

					ac_process.createAccount();
					break;

				case 2:
					ac_process.login();
					break;

				case 3:
					System.out.println("Goodbye!");
					break;

				default:
					System.out.println("Invalid option");
				}
			}
		}
		while(choice!=3);
		System.out.println("Thank you for using our service, Please visit again...");
		sc.close();

	}
}
