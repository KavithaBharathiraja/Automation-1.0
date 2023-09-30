package Assignment_1;
import java.util.Scanner;
public class question_8 {

	public static void main(String[] args) {
	 //How can we make String upper case to lower case?
		
	Scanner scanner =  new Scanner(System.in);
	
	System.out.println("Enter any UPPERCASE String: ");
	String uppercse = scanner.nextLine();
	
	System.out.println();
    String lowecase = uppercse.toLowerCase();
	
    System.out.print("The LOWERCASE String: \n"+lowecase);
	scanner.close();	
		
		


	}

}
