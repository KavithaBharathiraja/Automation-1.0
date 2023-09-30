package Sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		int size = scanner.nextInt();
		
		int []array = new int[size];
		
		System.out.println("Enter the elements of the Array: ");
		
		for(int i=0; i<size; i++) {
			array[i]=scanner.nextInt();
		}
		
		for(int i=0; i<size-1; i++) 
		{
		  int Minindex = i;
		  
		  for(int j =i+1; j<size; j++) 
		{
				
				if(array[j] < array[Minindex]) 
		{
				
		  Minindex= j;
					
				int temp = array[i];
				array[i]= array[Minindex];
				array[Minindex] = temp;	
			
				}
			}
			
		}
		System.out.println("The sorted Array: ");
		for(int i=0; i<size; i++) 
		{
			System.out.println(array[i]+" ");
		}
	
        scanner.close();
	}

}
