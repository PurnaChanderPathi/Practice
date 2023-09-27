package Strings;

import java.util.Scanner;

class subStr
{

public static void subString(String str,int n)
{
	for(int i=0; i<n; i++)
		for(int j=i+1; j<n; j++)
			System.out.println(str.substring(i, j));
}

public static void main(String[] args) {
	//String str = "purna";
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the word");
	String str = scn.nextLine();
	subString(str,str.length());
	
}
	

}
