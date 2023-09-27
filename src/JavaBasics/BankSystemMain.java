package JavaBasics;

import java.util.Scanner;

public class BankSystemMain {
	

	public static void main(String[] args) {
		int UserResponce;
		double amount;
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("***Welcome to HDFC***");
		System.out.println("Select 1 To Open Account in Savings Account");
		System.out.println("Select 2 To Open Account in Current Account");
		UserResponce = scn.nextInt();
		
		if(UserResponce ==1)
		{
		System.out.println("****SAVINGS ACCOUNT*****");
		}
		else
		{
			System.out.println("****CURRENT ACCOUNT*****");	
		}

		BankSystem bank = new BankSystem();
		bank.AccountNumber=111331;
		bank.balance=1000;
		bank.AccountDetails();
		
		System.out.println("Please Enter your Account Number");
		long accNumber=scn.nextLong();
		
		if(bank.AccountNumber == accNumber)
		{
			System.out.println("***Bank Operations are:");
			System.out.println("For Deposit Press 1");
			System.out.println("For Withdraw press 2");
			System.out.println("For Balance Enquiry Press 3");
			System.out.println("For Account Details Press 4");
			System.out.println("For InterestRate");
			System.out.println("For Exit Press 5");
			System.out.println("Choose Your Operator");
			UserResponce = scn.nextInt();
		
		
		if(UserResponce == 1)
		{
			System.out.println("How Much Money You Want To Deposit");
			amount = scn.nextDouble();
			bank.deposit(amount);
			bank.BalanceEnquiry();
		}
		
		if(UserResponce == 2)
		{
			System.out.println("How Much Money You Want To Withdraw");
			amount = scn.nextDouble();
			bank.withdrawal(amount);
			bank.BalanceEnquiry();
		}
		if(UserResponce == 3)
		{
			bank.BalanceEnquiry();
		}
		if(UserResponce == 4)
		{
			bank.AccountDetails();
		}
		if(UserResponce == 5)
		{
			System.out.println("Enter Amount");
			amount=scn.nextDouble();
			
			System.out.println("Enter InterestRate");
			int interest=scn.nextInt();
			
			System.out.println("Enter Number of years");
			int year=scn.nextInt();
			
			bank.interestRate(amount, interest, year);
			
		}
		if(UserResponce == 6)
		{
			System.out.println("Thanks You! Visit Again");
		}
		}
			
		
	else
	{
		System.out.println("Your Account did'nt Exists");
	}
		

	




	}

		
		
	}

