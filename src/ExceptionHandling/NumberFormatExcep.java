package ExceptionHandling;

import java.util.Scanner;

public class NumberFormatExcep  {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter an integer: ");
	            String input = scanner.nextLine();
	            int num = Integer.parseInt(input);
	            System.out.println("You entered: " + num);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid integer.");
	        }

	        scanner.close();
	    }
	


}
