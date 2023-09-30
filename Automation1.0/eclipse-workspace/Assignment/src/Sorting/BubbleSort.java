package Sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		int size = scanner.nextInt();
		
		int []array = new int [size];
		
		System.out.println("Enter the elements of the Array: ");
		for(int i=0; i<size; i++) 
		{
			array[i] = scanner.nextInt();
		}
		
		for(int i=0; i<size-1; i++) 
		{
		  for(int j =0; j<size-1; j++)
		  {
			  if(array[j]>array[j+1]) {
				  int temp = array[j];
				  array[j] = array[j+1];
				  array[j+1]= temp;
			  }
		  }
		}
		System.out.println("The Sorted Array using BubbleSort: ");
		for(int i=0; i<size; i++) {
			System.out.println(array[i]+" ");
		}
		scanner.close();
		
        }      
        
	}


