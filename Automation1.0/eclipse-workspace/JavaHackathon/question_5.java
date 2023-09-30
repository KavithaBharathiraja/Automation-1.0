package Assignment_1;
import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {

		/*Given an array prints the unique numbers 
		 * and also print the number of occurrences 
		 * of duplicate numbers.
		 */
		
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of elements in the array: ");
	
	int n = scanner.nextInt();
	
	int[]numbers =new int[n];
	
	System.out.println("Enter the elements of the array: ");
	
	for(int i = 0; i < n; i++) {
		numbers[i]=scanner.nextInt();
	}	
		//print unique numbers
		
	System.out.println("Unique Numbers: ");
	
	for(int i = 0; i < n; i++) {
		
		boolean isUnique = true;
		
	for(int j = 0; j < i; j++) {	
		if(numbers[i] == numbers[j]) {
			
			isUnique = false;
			
			break;
		}
	}
	if (isUnique) {
		
		System.out.println(numbers[i]+ "");			
	}
	}	
		
System.out.println();
	
		  
            // print occurrence of duplicate numbers

    System.out.println("Occurance of Duplicate Numbers: ");
    
    for(int i = 0; i< n; i++) {
    	
    	int count =0;
    for(int j = 0; j < i; j++) {
    	
    	if(numbers[i] == numbers[j]) {
    		count++;
  
    	}
    }	
    if(count>1) {
    	
    	System.out.println(numbers[i] + ": " + count + "times");
    }
    
    }
	scanner.close();	
	}

}
