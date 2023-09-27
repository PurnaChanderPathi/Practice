package JavaBasics;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
	System.out.println("Enter Employee Name:");
	String empname = scn.nextLine(); 
	System.out.println("Enter Employee Id");
	int empid = scn.nextInt();
	System.out.println("Enter Employee Salary");
	int empSalary = scn.nextInt();
	System.out.println("Enter Percentage");
	Double empPerc = scn.nextDouble();
	scn.nextLine(); // Consume newline
		
	Employee emp = new Employee(empname, empid, empSalary,empPerc);
	
	
	emp.calculateBonus(empPerc);
	System.out.println();
	
	scn.close();
	}
	

}
