package JavaBasics;

public class BankAccount {
	long accountNumber;
	double balance;
	
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void currentBalance()
	{
		System.out.println("Current balance is:"+balance);
	}
	
	public void deposit(double amount)
	{
		this.balance=balance+amount;
		System.out.println(amount+" Rupees Credited in your Account");
	}
	
	public BankAccount()
	{
		super();
	}
	public void withdrawl(double amount)
	{
		if(balance>=amount)
		{
			this.balance = balance-amount;
			System.out.println(amount+" Rupees Deduted from your Account");
		}
		else
		{
			System.out.println("You Don't have Sufficient balance");
		}
	}
	
	void accountDetails()
	{
		System.out.println("Account Number"+accountNumber);
		System.out.println();
		System.out.println("Available Balance"+balance);
		System.out.println();
	}
	
	void balanceEnquiry()
	{
		this.accountDetails();
	}
	public BankAccount(long accountNumber, double balance)
	{
		super();
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

}
