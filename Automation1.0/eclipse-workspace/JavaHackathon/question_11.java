package Assignment_1;
import java.util.*;
public class question_11 {

	public static void main(String[] args) {
		// How to Split String in java?

			
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter s String: ");
	java.lang.String inputString = scanner.nextLine();
	
	System.out.println("Enter the delimiter: ");
	String delimiter = scanner.nextLine();
	
	String[] parts = inputString.split(delimiter);
	System.out.println("\nSplit parts of the orginal String:\n");
	for(String part : parts) {
		System.out.println(part);
	}
		scanner.close();
		
		
			
		}
		
		

	}


