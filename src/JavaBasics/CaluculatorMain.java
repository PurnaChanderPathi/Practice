package JavaBasics;

import java.util.Scanner;

public class CaluculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userResponse;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("*** Operations:");
		System.out.println("For Addition Press 1");
		System.out.println("For Subraction press 2");
		System.out.println("For Multiplication Press 3");
		System.out.println("For Division Press 4");
		System.out.println("Choose Your Operator");
		userResponse = scn.nextInt();
		
		if(userResponse == 1)
		{
			System.out.println("Enter Number 1");
			int num1 = scn.nextInt();
			System.out.println("Enter Number 2");
			int num2 = scn.nextInt();
			
			CalculatorOperation cal = new CalculatorOperation();
			cal.addition(num1, num2);
			
		}
		else if(userResponse == 2)
		{
			System.out.println("Enter Number 1");
			int num1 = scn.nextInt();
			System.out.println("Enter Number 2");
			int num2 = scn.nextInt();
			
			CalculatorOperation cal = new CalculatorOperation();
			cal.Substitute(num1, num2);
			
		}
		else if(userResponse == 3)
			{
				System.out.println("Enter Number 1");
				int num1 = scn.nextInt();
				System.out.println("Enter Number 2");
				int num2 = scn.nextInt();
				
				CalculatorOperation cal = new CalculatorOperation();
				cal.Multiply(num1, num2);
			 }
		else if(userResponse == 4)
				{
					System.out.println("Enter Number 1");
					int num1 = scn.nextInt();
					System.out.println("Enter Number 2");
					int num2 = scn.nextInt();
					
					CalculatorOperation cal = new CalculatorOperation();
					cal.Divide(num1, num2);
				 }

	}

}
