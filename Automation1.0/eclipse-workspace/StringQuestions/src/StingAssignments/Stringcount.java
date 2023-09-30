package StingAssignments;
import java.util.Scanner;
public class Stringcount {

	public static void main(String[] args) {
		
 
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string: ");
		        String str = scanner.nextLine();

		        int wordCount = 0;
		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) == ' ') {
		                wordCount++;
		            }
		        }

		        System.out.println("The number of words in the string is " + wordCount);
		        scanner.close();
		    }
		}


	


