package Assignment_1;
import java.util.*;
public class question_18 {

	public static void main(String[] args) {
   //WJP to display duplicate character in string

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your sentence: ");
		String str = scanner.nextLine();
		
	
		String Duplicatecharacter =" ";
		
		for(int i =0; i<str.length(); i++) {
			
			for(int j =i+1; j<str.length(); j++) {
				
		if(str.charAt(i)==str.charAt(j)) {
			
			String s = Character.toString(str.charAt(i));
			
			if(!Duplicatecharacter.contains(s)) {
				
				Duplicatecharacter =Duplicatecharacter+ str.charAt(i);
			}
		break;
		
		}	
			}
		
		}
						
		  System.out.print("Duplicate Characters Are:");
		  System.out.println();
		  System.out.print(""+Duplicatecharacter );
		  
		 scanner.close();
 }

	}


