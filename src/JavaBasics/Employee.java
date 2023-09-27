package JavaBasics;

public class Employee {
	String name;
	int id;
	int salary;
	double percentage;

	
	public Employee(String name,int id, int salary,double percentage)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.percentage=percentage;
	}
	
	public void calculateBonus(double percentage)
	{
		
		double bonus = (salary*percentage/100);
	System.out.println("Bonus"+" "+bonus);
	double totalsalary =bonus+salary;
	System.out.println("Total Salary with Bonus"+" "+totalsalary);
	}
		
		public String getName()
		{
			return name;
		}
		
		public int getId()
		{
			return id;
		}
		
		public int getSalary()
		{
			return salary;
		}
		
	

}
