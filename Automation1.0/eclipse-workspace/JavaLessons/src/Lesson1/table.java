package Lesson1;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		
		
 Scanner scanner = new Scanner(System.in);
		
System.out.println("Entera Number: " );

int Number = scanner.nextInt();
	
System.out.println("Multipilication Table for: " + Number);

   for(int i=1; i<=10;i++)
   {
	   int result = Number*i;
	   
	 System.out.println(Number+"*"+i+"=" +result);
   }
   
   scanner.close();
   
 System.out.println("");

   

	}
	

}
