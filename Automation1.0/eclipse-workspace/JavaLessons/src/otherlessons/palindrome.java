package otherlessons;

import java.util.Scanner;
public class palindrome {

	public static boolean Palindrome(int[] array) {
		
	
		int start =0;
		int end =array.length-1;
		
		while(start<end) {
			if(array[start]!= array[end]) {
				return false;
			}
			
			start++;
			end--;
		}
		
	    return true;
	}	
public static void main1(String[]args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter the number of elements in the array: ");
	int n =scanner.nextInt();
	
	int[]numbers =new int[n];
	
	System.out.println("Enter the elements of the array ");
	for(int i =0; i<n; i++) {
		numbers[i] = scanner.nextInt();
	}
	
	System.out.println("Array is palindrome: "+Palindrome (numbers));
	
	scanner.close();	
}
	
		
		

	}


