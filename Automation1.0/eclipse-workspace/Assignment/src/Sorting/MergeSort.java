package Sorting;
import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		
		int size = scanner.nextInt();
		
		int [] array = new int [size];
		
		System.out.println("Enter the elements of the Array: ");
		for(int i=0; i<size; i++)
		{
		  array[i] = scanner.nextInt();		
		}
		// divided the array into 2 arrays:
		int left=0; 
		int	right=0;
		int Mid = size/2;
		
		int size1 = Mid - left+1;
		int size2 = right - Mid;
		
		
		int[] leftarray = new int[size1];
		int[] rightarray = new int[size2];
		
		// copying the element for left array:
		
		for(int i=0; i<size1; i++) 
		{
			leftarray[i] = array[left+1];
		}
		
		// copying the elements for right array
		
		for(int j=1; j<size2; j++) 
		{
			rightarray[j] = array[Mid+1+j];
		}
		
		// sorting arrays
		
		int i= 0, j= 0, k= left;
		
		while(i<size1 && j<size2) 
		{
			if(leftarray[i] <= rightarray[j]) 
		{
				array[k] = leftarray[i];
				i++;
		}else {
				array[k] = rightarray[j];
				j++;
		}
		   k++;
		}
		
		while(i<size1) {
			array[k] = leftarray[i];
			i++;
			k++;
		}
		
		while(j<size2) {
			array[k] = leftarray[j];
			j++;
			k++;
		}
		scanner.close();
		System.out.println("The sorted Array: ");
		for(int num : array) 
		{
		 System.out.println(num+" ");
		}
		
		
		
		       
		
		

	}

}
