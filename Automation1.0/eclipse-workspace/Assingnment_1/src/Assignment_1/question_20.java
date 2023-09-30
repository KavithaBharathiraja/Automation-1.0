package Assignment_1;
import java.util.*;
public class question_20 {

	public static void main(String[] args) {
		/*WJP to find total number of repeated integers, 
		 * uppercase and lowercase character in the give string
		 */

		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        System.out.println();
	        
	        
	 int digitCount = 0;
     int uppercaseCount = 0;
     int lowercaseCount = 0;

     int[] digitArray = new int[10];
     int[] uppercaseArray = new int[26];
     int[] lowercaseArray = new int[26];

     for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i); //method to access individual char from string based on their index.    
//retrieve from input 
         if (ch >= '0' && ch <= '9') {
             digitCount++;
             digitArray[ch - '0']++; //convert character digit it it  corresponding integer value.
         } else if (ch >= 'A' && ch <= 'Z') {
             uppercaseCount++;
             uppercaseArray[ch - 'A']++;
         } else if (ch >= 'a' && ch <= 'z') {
             lowercaseCount++;
             lowercaseArray[ch - 'a']++;
         }
     }

     System.out.println("Total integers: " + digitCount);
     System.out.println("Total uppercase characters: " + uppercaseCount);
     System.out.println("Total lowercase characters: " + lowercaseCount);
     
     System.out.println();

     System.out.println("Repeated integers count:");
     for (int i = 0; i < 10; i++) {
         if (digitArray[i] > 1) {
             System.out.println(i + ": " + digitArray[i]);
         }
     }

     System.out.println("Uppercase characters count:");
     for (int i = 0; i < 26; i++) {
         if (uppercaseArray[i] > 1) {
             System.out.println((char) ('A' + i) + ": " + uppercaseArray[i]);
         }
     }

     System.out.println("Lowercase characters count:");
     for (int i = 0; i < 26; i++) {
         if (lowercaseArray[i] > 1) {
             System.out.println((char) ('a' + i) + ": " + lowercaseArray[i]);
         }		
     }
     
     scanner.close();
	}

}
