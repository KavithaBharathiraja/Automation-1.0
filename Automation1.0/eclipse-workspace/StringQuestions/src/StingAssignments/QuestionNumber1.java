package StingAssignments;
import java.util.*;
public class QuestionNumber1 {

	public static void main(String[] args) {
		/* Given Two Strings. first String is a sentence and 
		the second is a character . You need to write a Program 
		to print number of characters in between the occurrence of 
		second string excluding spaces. 
		String1 = "I Love Java Programming"
		String2 = "o"*/
		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the first string:");
	    String str1 = scanner.nextLine();
	    
	    System.out.println("Enter the second string:");
	    String str2 = scanner.nextLine();
	    
	    int count = 0;
	    int i = 0;
	    while (true) {
	      int j = str1.indexOf(str2, i);
	      if (j == -1) {
	        break;
	      }
	      count += j - i - str2.length() + 1;
	      i = j + str2.length();
	    }
	    System.out.println("The number of characters in between the occurrence of the second string excluding spaces is: " + count);
	    scanner.close();
	  }
	

	}


