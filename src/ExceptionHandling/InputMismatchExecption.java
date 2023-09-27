package ExceptionHandling;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputMismatchExecption  {
	    public static void main(String[] args) {
	        List<Integer> numbers = readNumbers();
	        System.out.println("Entered numbers: " + numbers);
	    }
	    
	    public static List<Integer> readNumbers() {
	        List<Integer> numbers = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter numbers (non-numeric input to stop):");
	        while (true) {
	            try {
	                int num = scanner.nextInt();
	                numbers.add(num);
	            } catch (InputMismatchException e) {
	                // Non-numeric input encountered
	                System.out.println("Non-numeric input. Exiting input loop.");
	                break;
	            }
	        }
	        
	        scanner.close();
	        return numbers;
	    }
	


}
