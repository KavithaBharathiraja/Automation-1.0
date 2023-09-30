package JavaHomework;
import java.util.*;
public class day2switchwithscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int Number1= scanner.nextInt();
		

		System.out.println("Enter the second number: ");
		
		int Number2= scanner.nextInt();
		
		System.out.println();
		
		System.out.println("The value of two numbers before swapping: ");
		System.out.println("First Number= "+Number1);
		System.out.println("Second Number= "+Number2);
		
		System.out.println();
		
		int temp = Number1;
	    Number1 = Number2;
	    Number2 = temp;

	    System.out.println("The value of two numbers after swapping");
	    System.out.println("First number: " + Number1);
	    System.out.println("Second number: " + Number2);

		scanner.close();

		}
	}


