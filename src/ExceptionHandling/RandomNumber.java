package ExceptionHandling;
import java.util.Random;

public class RandomNumber  {
	    public static void main(String[] args) throws HighNumberException {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1; // Generates a number between 0 and 99, so we add 1 to shift it to 1-100 range
	        
	        
	        System.out.println("Random Number: " + randomNumber);
	        if(randomNumber >=80)
	        {
	        	throw new HighNumberException("Randam Number is Greater then 80");
	        }
	        
	    }
	

}
