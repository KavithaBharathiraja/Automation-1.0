package Assignment_1;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		
		//WJP to perform ascending order Selection sort
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array: ");	
		int n = scanner.nextInt();
		int[]array =new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n; i++) {
			 array[i] =scanner.nextInt();
		}		
		// 	Selection sort
		
		 System.out.println("Original Array:");
	        printArray(array);
	       SelectionSort(array);
	       
	       System.out.println("\nSorted Array:");
	        printArray(array);
	        
	    scanner.close();
	}
	
	private static void SelectionSort(int[] array) {
           int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;		
                }	
            }	
         //Swap the current element with minimum element
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
	}
        }
	 public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	
	 }
	 
}