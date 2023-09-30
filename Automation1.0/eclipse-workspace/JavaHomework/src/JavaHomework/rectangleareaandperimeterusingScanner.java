package JavaHomework;
import java.util.Scanner;
public class rectangleareaandperimeterusingScanner {

	public static void main(String[] args) {
    
		
		Scanner scanner = new Scanner(System.in);
		
		 /*
         * to print the area(width*height)and
         * perimeter(2*(width*height)) of a rectangle:
         */
        	   
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        
     //calculate the Area of a rectangle
        double Area = width * height;
        
     //calculate the Perimeter of a rectangle
        double Preimeter= 2*(width+height);
        
        System.out.println("Area of the rectangle: " +Area);
        System.out.println("Perimeter of the rectangle: " +Preimeter);
        
        scanner.close();
        

	}

}
