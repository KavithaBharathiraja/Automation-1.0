package Assignment_1;
import java.util.*;
public class question_3 {
	
	public static void main(String[] args) {
		
		/*Given an array of integers,
		 *sort the integer values.
		 */
			
   Scanner scanner = new Scanner(System.in);


  System.out.println("Enter the number of Array which you wanteded to sort:");		
	int	n = scanner.nextInt();
	
	int[] numbers = new int[n];
	
	System.out.println("Enter the elements of the array: ");
	
	    for(int i=0; i<n; i++) {
		numbers[i] = scanner.nextInt();
	}
	    
	// Sorting the Array (selection sort method)
	
	for(int i =0; i< n-1; i++) {
		
		int minIndex = i;
		
	    for(int j = i+1; j<n; j++) {
		
		if(numbers[j]<numbers[minIndex]) {
			minIndex = j;
			
		}
	}
	   //swapping the minimum element with current element
	    
	    int temp = numbers[i];
	    numbers[i] = numbers[minIndex];
	    numbers[minIndex] = temp;        
		
	}
	
	System.out.println("Sorted array: ");
	for(int i = 0; i< n; i++) {
		System.out.println(numbers[i]+ " " );
	} 
	
	
	
	scanner.close();
	
	}	

}
