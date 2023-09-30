package Assignment_1;
import java.util.*;
public class question_10 {

	public static void main(String[] args) {
		//What is String subSequence method?
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the String: ");
		java.lang.String inputString = scanner.nextLine();
		
		System.out.println("Enter the staringindex: ");
		int startingindex = scanner.nextInt();
		
		System.out.println("Enter the endingindex: ");
		int endingindex = scanner.nextInt();

	    
		CharSequence subSequence = inputString.subSequence(startingindex, endingindex);
		
		
		System.out.println("Subsequence: \n" + subSequence);
		
		scanner.close();

	}

}
