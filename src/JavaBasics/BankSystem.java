package JavaBasics;

public class BankSystem {
	long AccountNumber;
	double balance;
	double amount;
	int interestPaid;
	int years;
	
	
	public void setaccountNumber(long AccountNumber)
	{
		this.AccountNumber=AccountNumber;
	}
	public long getaccountNumber()
	{
		return AccountNumber;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public BankSystem()
	{
		super();
	}
	
	public void deposit(double amount)
	{
		this.balance=balance+amount;
		System.out.println("Amount Credit in Your Account :"+amount);
		
	}
	public void withdrawal(double amount)
	{
		if(balance>amount)
		{
			this.balance=balance-amount;
			System.out.println("Amount debited From your Account :"+amount);
		}
	}
	
	void AccountDetails()
	{
		System.out.println("Account Number:"+AccountNumber);
		System.out.println();
		System.out.println("balance:"+balance);
		System.out.println();
	}
	
	void BalanceEnquiry()
	{
		this.AccountDetails();
	}
	public void interestRate(double amount,int interestPaid,int years)
	{
		if(amount != 0 && interestPaid != 0 && years !=0)
		{
			double interest=(interestPaid/amount*years);
			System.out.println("Rate of Interest"+interest);
		}
	}
	public BankSystem(long accountNumber, double balance)
	{
		super();
		this.AccountNumber=accountNumber;
		this.balance=balance;
	}
	
	
}
