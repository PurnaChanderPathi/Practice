package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;


public class ReverseOrder {
		
	static String reverseWords(String str)
	{
		
		 Pattern pattern = Pattern.compile("\\s");
		 
		 String[] temp = pattern.split(str);
	        String result = "";
	        
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
	        return result;

		
	}
	   public static void main(String[] args)
	    {
		   Scanner scn = new Scanner(System.in);
		   System.out.println("Enter the Sentence you want to Reverse");
            String s1 = scn.nextLine();
//		   String s1 = "How are you doing purna";
		   
	        System.out.println(reverseWords(s1));
	 
	    }

}
