package Sorting;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		
      Scanner scanner =new Scanner(System.in);
      
      System.out.println("Enter the size of an Array: ");
      int size = scanner.nextInt();
        
      int[]array = new int[size];
      
      System.out.println("Enter the elements of the Array: ");
      for(int i=0; i<size; i++) 
      {
         array[i]=scanner.nextInt();
      }
      for(int i=1; i<size; i++) 
      {
    	  int current = array[i];
    	  int j = i-1;
      while(j>=0&&array[j]>current)
      {
    	 array [j+1]=array[j];
    	 j--;
      }
         array[j+1]=current;
      }
      
      System.out.println("The Sorted Array");
      
      for(int i=0; i<size; i++) {
    	  
    	  System.out.println(array[i]+" ");
      }
      
      scanner.close();
      
	}

}
