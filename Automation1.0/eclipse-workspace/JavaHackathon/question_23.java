package Assignment_1;
import java.util.*;
public class question_23 {

	public static void main(String[] args) {
		//WJP to differentiate input as string, int or bool:
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter input:");
	String input = scanner.nextLine();
	
	try{int num = Integer.parseInt(input);
	System.out.println("This is a integer: "+num);
	scanner.close();	
	return;}catch(NumberFormatException e) {
		
	}
	
	if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")) {
		
		boolean bool =Boolean.parseBoolean(input);
		System.out.println("This is a boolean: "+bool);
		
	}else {
		System.out.println("This is a String: "+input);
	}
		

	
	}

}
