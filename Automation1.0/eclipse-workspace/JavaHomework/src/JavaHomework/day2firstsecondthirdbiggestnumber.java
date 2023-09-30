package JavaHomework;
import java.util.Scanner;

public class day2firstsecondthirdbiggestnumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
System.out.println("Enter the total count of numbers:");

  int count = scanner.nextInt();
  
  int firstLargest = Integer.MIN_VALUE;
  int secondLargest = Integer.MIN_VALUE;
  int thirdLargest = Integer.MIN_VALUE;
  
  for(int i =0; i<=count; i++) {
	  System.out.println("Enter number " +(i+1) + ":");
	  
	  int number = scanner.nextInt();
	  
	  if(number>firstLargest) {
		  thirdLargest=secondLargest;
		  secondLargest=firstLargest;
		  firstLargest=number;
	  }else if(number>secondLargest){
		  thirdLargest=secondLargest;
		  secondLargest=number;
	  }else if(number>thirdLargest) {
		  thirdLargest=number;
	  }
	  
  }
	System.out.println("First Largest number: " +firstLargest);
	System.out.println("Second Largest number: " +secondLargest);
	System.out.println("Third Largest number: " +thirdLargest);
	
	scanner.close();
	
	  
	  
  }
		

	}


