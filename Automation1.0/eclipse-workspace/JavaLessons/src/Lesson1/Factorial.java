package Lesson1;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		// without recursion(use for loop)
		
	
		System.out.println("Enter any possitive Number: ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println();
		
       int Factorial =1;
        
        for(int i=1; i<=number; i++){
        	
        	Factorial = Factorial*i;		
        }
	
        System.out.println("The Factorial of " +number + " is= " + Factorial+"." );
        
        
	scanner.close();
 

	
		
		
		
		
	}

}
