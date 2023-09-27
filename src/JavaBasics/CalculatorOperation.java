package JavaBasics;

public class CalculatorOperation {
	int number1;
	int number2;
	
	
	public void setNumber1(int number1)
	{
		this.number1=number1;
	}
	public int getNumber1()
	{
		return number1;
	}
	
	public void setNumber2(int number2)
	{
		this.number2=number2;
	}
	public int getNumber2()
	{
		return number2;
	}
	public void addition(int number1,int number2)
	{
	int addition=number1+number2;	
	System.out.println("Addition:"+addition);
	}
	
	public void Substitute(int number1,int number2)
	{
	int substitute=number1-number2;	
	System.out.println("Substitute:"+substitute);
	}
	
	public void Multiply(int number1,int number2)
	{
	int multiply=number1*number2;	
	System.out.println("Multiply:"+multiply);
	}
	
	public void Divide(int number1,int number2)
	{
	int divide=number1/number2;	
	System.out.println("Divide:"+divide);
	}
	

}
