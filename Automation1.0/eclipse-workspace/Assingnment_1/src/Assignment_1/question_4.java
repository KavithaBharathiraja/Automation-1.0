package Assignment_1;
import java.util.*;
public class question_4 {

	public static void main(String[] args) {
		// Given an array of integers check the Palindrome of the series.

	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter minimum three numbers:");
	
	int n = scanner.nextInt();
		
	int n1,n2 = 0,k;
	n1=n;
	while(n!=0) {
		
		k = n%10;
		n2 = n2*10+k;
		n = n/10;
		
	}
	if(n2==n1) {
		
		System.out.println("The Number is a Palindrome");
		
	}
	else {
		
		System.out.println("The Number is Not a Palindrome");
		
	}
	scanner.close();
	
	}

}
