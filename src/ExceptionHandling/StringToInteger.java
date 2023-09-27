package ExceptionHandling;

public class StringToInteger {
    public static void main(String[] args) {
        String input1 = "xyz";
        String input2 = "123";
        
        int result1 = convertStringToInt(input1);
        int result2 = convertStringToInt(input2);
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
    
public static int convertStringToInt(String input)
{
	try
	{
		return Integer.parseInt(input);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Error Converting String to Integer:" +e.getMessage());
		 return 0;
	}
}
}

