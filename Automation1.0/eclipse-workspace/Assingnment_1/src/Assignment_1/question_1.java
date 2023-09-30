package Assignment_1;

import java.util.Scanner;

/*Consider there is a 3 Boolean variable called a, 
 * b, c. Check if at least two out of three Booleans
 * are true with scanner
 * 
 */

public class question_1 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter the value for a as(true/false):");
boolean a = scanner.nextBoolean();
System.out.println();

System.out.print("Enter the value for b as(true/false):");
boolean b = scanner.nextBoolean();
System.out.println();


System.out.print("Enter the value for b as(true/false):");
boolean c = scanner.nextBoolean();
System.out.println();


//checking for two out of three Booleans are true:

if((a&&b)||(a&&c)||(b&&c)) {
	
	System.out.println("Atleat two out of three Booleans are true.");
}else {
	System.out.println("Less than two out of three Booleans are true.");
}
		
	scanner.close();	

	}

}
