package JavaHomework;
import java.util.Scanner;
public class tableusingScanner {

	public static void main(String[] args) {
		

	
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");

	int number = scanner.nextInt();
	
 System.out.println("Multiplication Table for " + number + ":");

	for (int i = 1; i <= 10; i++) {
		     int result = number * i;
System.out.println(number + " * " + i + " = " + result);
		        }

	scanner.close();

	}

}
