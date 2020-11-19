package com.bank.www;

import java.util.Scanner;

public class Banking_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Details");
		System.out.print("Enter Bank Account Name: ");
		String uname=sc.nextLine();
		System.out.print("Enter Your Bank Account No: ");
		String uno=sc.nextLine();
		Banking bank=new Banking(uname,uno);
		bank.showmenu();
		
		
	}

}
class Banking{
	/**
	 * 1.Balance Enquiry
	 * 2.Deposit
	 * 3.Withdraw
	 * 4.Previous transaction 
	 * 5.show Menu
	 * 6.Exit...
	 */
	int balance;
	String username;
	String useraccountnumber;
	int previous_transaction;
	//_______________________________________________________________
	
	
	
	
	public Banking(String uname,String uno)
	{
		username=uname;
		useraccountnumber=uno;
	}
	
	public void deposit(int ammount)
	{
		if(ammount!=0) {
		balance=balance+ammount;
		previous_transaction=ammount;
		}
	}
	public void withdraw(int ammount)
	{
		if(ammount!=0) {
		balance=balance-ammount;
		previous_transaction=-ammount;
		}
	}
	public void getPrevioustransaction()
	{
		if(previous_transaction>0)
		{
			System.out.println("Deposited "+ previous_transaction);
		}
		else if(previous_transaction<0)
		{
			System.out.println("Withdraw "+ Math.abs(previous_transaction));
		}
		else
		{
			System.out.println("No transactions");
		}
	}
	public void showmenu()
	{
		int option=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello, Greetings of the day "+username);
		System.out.println("Your Account Id is " +useraccountnumber);
		System.out.println("========================================================");
		System.out.println("Enter an option");
		System.out.println("========================================================");
		System.out.println();
		System.out.println("1:- Balance Enquiry");
		System.out.println("2:- Deposit");
		System.out.println("3;- Withdraw");
		System.out.println("4:- Previous Transaction");
		System.out.println("5:- Exit");
		
		//Scanner sc=new Scanner(System.in);
		//int option=sc.nextInt();
		do {
			System.out.println("----------------------------------------------");
			System.out.printf("Enter an option:");
			option=sc.nextInt();
			System.out.println();
		
			
		
		switch(option)
		{
		case 1:
			System.out.println("--------------------------------------");
			System.out.println("Your Balance is "+balance);
			System.out.println("---------------------------------------");
			break;
		case 2:
			System.out.println("----------------------------------");
			System.out.println("Enter ammount to Deposit");
			int ammount=sc.nextInt();
			deposit(ammount);
			System.out.println("You Successfully deposited "+ammount);
			System.out.println("Your Balance is "+balance);
			break;
		case 3:
			System.out.println("------------------------------------");
			System.out.println("Enter ammount to Withdraw");
			int w=sc.nextInt();
			withdraw(w);
			System.out.println("You Successfully withdraw "+w);
			System.out.println("Your Remaining Balance is "+balance);
			break;
		case 4:
			System.out.println("---------------------------------------");
			getPrevioustransaction();
			break;
		case 5: 
			System.out.println("----------------------------------------");
			System.out.println("Thank you for using our Services");
			break;
		default:
			System.out.println("Please enter valid option");
			break;
		}
		
		}
		while(option!=5);
		{
			System.out.println("***************************************************");
		}
		
	

	}
}

