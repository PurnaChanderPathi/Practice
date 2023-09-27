package ExceptionHandling;

public class ChainedException 
{
	    public static void main(String[] args) {
	        try {
	            doSomething();
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	            Throwable cause = e.getCause();
	            if (cause != null) {
	                System.out.println("Original Exception: " + cause.getMessage());
	            }
	        }
	    }
	    
	    public static void doSomething() {
	        try {
	            // Simulate a custom exception
	            throw new CustomException("Custom Exception occurred.");
	        } catch (CustomException e) {
	            // Wrap the custom exception in a RuntimeException
	            throw new RuntimeException("Wrapped RuntimeException", e);
	        }
	    }
	

}
