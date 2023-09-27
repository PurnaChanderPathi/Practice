package JavaBasics;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		//variables Declaration
		double amount;
		long accNumber;
		double bal;
		int userResponse;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("****Welcome to HDFC Bank*****");
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.balance=1000;
		bankAccount.accountNumber=1113133L;
		bankAccount.accountDetails();
		
		
		System.out.println("Please Enter your Account Number");
		accNumber=scn.nextLong();
		
		if(bankAccount.accountNumber == accNumber)
		{
			System.out.println("***Bank Operations are:");
			System.out.println("For Deposit Press 1");
			System.out.println("For Withdraw press 2");
			System.out.println("For Balance Enquiry Press 3");
			System.out.println("For Account Details Press 4");
			System.out.println("For Exit Press 5");
			System.out.println("Choose Your Operator");
			userResponse = scn.nextInt();
			
			if(userResponse == 1)
			{
				System.out.println("How Much Money You Want To Deposit");
				amount = scn.nextDouble();
				bankAccount.deposit(amount);
				scn.hasNextLine();
				bankAccount.balanceEnquiry();
			}
			
			if(userResponse == 2)
			{
				System.out.println("How Much Money You Want To Withdraw");
				amount = scn.nextDouble();
				bankAccount.withdrawl(amount);
				bankAccount.balanceEnquiry();
			}
			if(userResponse == 3)
			{
				bankAccount.balanceEnquiry();
			}
			if(userResponse == 4)
			{
				bankAccount.accountDetails();
			}
			if(userResponse == 5)
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
