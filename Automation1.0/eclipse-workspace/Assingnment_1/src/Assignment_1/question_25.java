package Assignment_1;

import java.util.Scanner;

public class question_25 {
	
	 public static void main(String[] args) {


		/*Write a program for binary search. 
		 * And 5 i/p has to take from user 
		 * as binary elements.
		 */

	Scanner scanner = new Scanner(System.in);
     
	 int[] arr = new int[5];

     System.out.println("Enter 5 binary elements (0s and 1s):");
     for (int i = 0; i < 5; i++) {
         arr[i] = scanner.nextInt();
         scanner.close();
     }

     System.out.print("Enter the element to search for: ");
     int target = scanner.nextInt();

     int index = binarySearch(arr, target);

     if (index != -1) {
         System.out.println("Element " + target + " found at index " + index);
     } else {
         System.out.println("Element " + target + " not found in the array.");
     }
 }

 public static int binarySearch(int[] arr, int target) {
     int left = 0;
     int right = arr.length - 1;

     while (left <= right) {
         int mid = left + (right - left) / 2;

         if (arr[mid] == target) {
             return mid;
         } else if (arr[mid] < target) {
             left = mid + 1;
         } else {
             right = mid - 1;
         }
     }

     return -1; // Element not found
 }
	
	
	 }
		
	        
	    	
	
	
	
	
		
		
		
		
		
		
		
		
		
	

