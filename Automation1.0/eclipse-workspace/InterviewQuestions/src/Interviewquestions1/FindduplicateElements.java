package Interviewquestions1;
import java.util.*;
public class FindduplicateElements {

	public static void main(String[] args) {
	
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of elements in Array: ");
       
       int n = scanner.nextInt();
       int [] array = new int[n];
       
       System.out.println("Enter the elements of the Array: ");
       for(int i= 0; i<= n; i++) {
    	   array[i] = scanner.nextInt();   
       }
       //Find Duplicate Elements:
       
       List<Integer>duplicates = new ArrayList<>();
       
       for(int i= 0; i< n; i++) {
    	   for(int j= i+1; j< n; j++) {
    		   if(array[i]==array[j]) {
    			   
    			   duplicates.add(array[i]);
    		   }
    	   }
       }
       
       if(duplicates.isEmpty()) { 
    	   System.out.println("There are no duplicate elements in the array.");
       }else {
    	   System.out.println("The duplicate elements in the array are: ");
    	   for(int i= 0; i< duplicates.size(); i++) {
    		  System.out.println(duplicates.get(i)+ " "); 
    		   
    	   }
   scanner.close(); 	   
       }
       
       
       
       
		
	}

}
