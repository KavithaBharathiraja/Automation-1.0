package JavaHomework;
import java.util.Scanner;

public class calculatingareaandperimeterusingScanner {

	public static void main(String[] args) {
		
//to print the area(π r²)and perimeter(2π r) of a circle:
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Calculate the perimeter of the circle
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        scanner.close();
        
       
        
       
        
        
        
        

        
		
		
		
		
	}

}
