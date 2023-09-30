package assignment;
import java.util.*;
public class question2 {

	public static void main(String[] args) {

		 //write a program to find factorial (Non Recursive):
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any possitive Number: ");
		
		
		int number = scanner.nextInt();
		
		System.out.println();
		
		int Factorial = 1;
		
		for(int i=1; i<= number; i++){
			
			Factorial = Factorial*i;
		}
		    
      System.out.println("The Factorial of " +number + " is= " + Factorial );	    
		
	scanner.close();	

		
		

	}

}
