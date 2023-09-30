package Assignment_1;

import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		
		
		//How can we make String Lower case to Upper case?
	
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter any LOWERCASE String: ");
		String lowercase = scanner.nextLine();
		
		System.out.println();
	    String uppercase = lowercase.toUpperCase();
		
	    System.out.print("The UPPERCASE String: \n"+uppercase);
		scanner.close();	
			
		
	}

}
