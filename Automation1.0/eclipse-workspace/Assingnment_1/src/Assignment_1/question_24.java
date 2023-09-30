package Assignment_1;
import java.util.*;
public class question_24 {

	public static void main(String[] args) {
		/*Write a program which inputs a 
		 *positive natural number N and prints 
		 *the possible consecutive number combinations, 
		 *which when added give N.INPUT:  N = 9  	
		 *OUTPUT:  4 + 5, 2 + 3+ 4
		 */ 
	Scanner scanner = new Scanner(System.in);
	
	 System.out.println("Enter a positive natural number: ");
	 int N = scanner.nextInt();
	 
	 System.out.println("Consecutive number compination: " +N+ ":");
	 for(int i = 1; i<= N/2; i++) {
		 int sum =i;
		 String combination = i+"";
		 
	for(int j =i+1; j <= N; j++) {
			sum += j;
			combination+= "+" +j;
			
	if(sum == N) {
				System.out.println(combination);
				break;		
			}else if (sum > N) {
				
			}
			
		}
	 }
scanner.close();
	}

}
