package Assignment_1;
import java.util.*;

public class question_30 {

	public static void main(String[] args) {
		/*Write a function to find out longest palindrome 
		 * in a given string?
		 */
		
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String longestPalindrome = findLongestPalindrome(input);
	        System.out.println("Longest palindrome: " + longestPalindrome);
	    }

	    public static String findLongestPalindrome(String str) {
	        String longestPalindrome = "";

	        for (int i = 0; i < str.length(); i++) {
	            // Check for odd-length palindromes
	            String oddPalindrome = expandPalindrome(str, i, i);
	            if (oddPalindrome.length() > longestPalindrome.length()) {
	                longestPalindrome = oddPalindrome;
	            }

	            // Check for even-length palindromes
	            String evenPalindrome = expandPalindrome(str, i, i + 1);
	            if (evenPalindrome.length() > longestPalindrome.length()) {
	                longestPalindrome = evenPalindrome;
	            }
	        }

	        return longestPalindrome;
	    }

	    public static String expandPalindrome(String str, int left, int right) {
	        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	            left--;
	            right++;
	        }
	      
	        return str.substring(left + 1, right);
	        
	    }
	  
}
