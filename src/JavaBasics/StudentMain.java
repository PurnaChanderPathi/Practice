package JavaBasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = scn.nextLine();
		
		System.out.println("Enter Student Age");
		int age = scn.nextInt();
		
		System.out.println("Enter Student Grade");
		char grade = scn.next().charAt(0);
		
		Student emp1 = new Student();
		
		//setter
		emp1.setName(name);
		emp1.setAge(age);
		emp1.setGrade(grade);
		

		
		//getter
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getGrade());

	}

}
