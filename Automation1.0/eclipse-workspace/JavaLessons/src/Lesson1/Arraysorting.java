package Lesson1;
import java.util.Arrays;


public class Arraysorting {

	public static void main(String[] args) {
		
		
		int[] numbers = {1,3,2,9,5,4,6,8,7,10};
		
		System.out.println("Original Array :" +Arrays.toString(numbers));
		
		System.out.println();
		
		//sort the Arrays in  ascending order:
		
		Arrays.sort(numbers);
		
		System.out.println("Sorted Array :" +Arrays.toString(numbers));
    
	}

}
