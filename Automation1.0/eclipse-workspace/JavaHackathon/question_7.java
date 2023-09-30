package Assignment_1;
import java.util.Scanner;
public class question_7 {

	public static void main(String[] args) {
			
		/*What are different ways to create String Object
		 * two ways:
		 * 1. String Literal.
		 * 2. with new keyword.

		 */
		
	// Crating String with Single Literal
		   //String s1 = "one"
		   //String s2 = "one"
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
	     java.lang.String s1 = scanner.nextLine();
	
		System.out.println("Enter the second string: ");
	      java.lang.String s2 = scanner.next();
		
	      scanner.close();
	
		System.out.println();
		
	// creating with new Keyword:
	   
	     String s3 =new String("one");
	     String s4 =new String("one");
	     
	     
	     System.out.println(s1 .equals(s2)); //check for space
	     System.out.println(s1 == s3);
	     System.out.println(s3 == s4);
	     System.out.println(s1.equals(s3)); //check for value
	     

	}

}
