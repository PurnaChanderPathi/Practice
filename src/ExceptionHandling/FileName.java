package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileName {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the File Name: ");
	        String fileName = scanner.nextLine();
	        
	        try {
	            FileInputStream fileInputStream = new FileInputStream(fileName);
	            int content;
	            while ((content = fileInputStream.read()) != -1) {
	                System.out.print((char) content);
	            }
	            fileInputStream.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	


}
