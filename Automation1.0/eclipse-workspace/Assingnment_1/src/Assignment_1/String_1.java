package Assignment_1;
import java.util.*;
public class String_1 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        java.lang.String input = scanner.nextLine();
	        System.out.println();
	        
		
		
	        int integerCount = 0;
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (isDigit(c)) {
	                integerCount++;
	            } else if (isUpperCase(c)) {
	                uppercaseCount++;
	            } else if (isLowerCase(c)) {
	                lowercaseCount++;
	            }
	        }

	        System.out.println("Integer count: " + integerCount);
	        System.out.println("Uppercase count: " + uppercaseCount);
	        System.out.println("Lowercase count: " + lowercaseCount);
	        
	        scanner.close();
	    }

	    private static boolean isDigit(char c) {
	        return c >= '0' && c <= '9';
	    }

	    private static boolean isUpperCase(char c) {
	        return c >= 'A' && c <= 'Z';
	    }

	    private static boolean isLowerCase(char c) {
	        return c >= 'a' && c <= 'z';
	    }

		public static int indexof(java.lang.String string2) {
			// TODO Auto-generated method stub
			return 0;
		}
			

	}



