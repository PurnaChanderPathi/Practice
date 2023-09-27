package InheritencePolymorphism;

import java.util.Scanner;


public class ShapeMain {

		public static void main(String[] args) {
		       Scanner scanner = new Scanner(System.in);

		       System.out.print("Enter the number of shapes: ");
		       int n = scanner.nextInt();

		       Shape[] shapes = new Shape[n];
		       for (int i = 0; i < n; i++) {
		           System.out.print("Enter shape " + (i+1) + " type (circle, rectangle, triangle): ");
		           String type = scanner.next();
		           switch (type) {
		               case "circle":
		                   System.out.print("Enter circle radius: ");
		                   double radius = scanner.nextDouble();
		                   shapes[i] = new Circle(radius);
		                   break;
		               case "rectangle":
		                   System.out.print("Enter rectangle length: ");
		                   double length = scanner.nextDouble();
		                   System.out.print("Enter rectangle width: ");
		                   double width = scanner.nextDouble();
		                   shapes[i] = new Rectangle(length, width);
		                   break;
		               case "triangle":
		                   System.out.print("Enter triangle base: ");
		                   double base = scanner.nextDouble();
		                   System.out.print("Enter triangle height: ");
		                   double height = scanner.nextDouble();
		                   shapes[i] = new Triangle(base, height);
		                   break;
		               default:
		                   System.out.println("Invalid shape type");
		                   i--;
		                   break;
		           }
		       }

		       System.out.println("Areas:");
		       for (Shape shape : shapes) {
		           System.out.println(shape.calculateArea());
		       }
		   

	}

}
