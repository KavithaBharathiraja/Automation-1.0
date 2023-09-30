package assignment;
import java.util.Scanner;
public class Stringscount {

	public static void main(String[] args) {
		// how many words in the string:
		
		Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter the sentence: ");
		
		String sentence = scanner.nextLine();
		
		int wordcount = 0;
		
		for(int i = 0; i< sentence.length(); i++) {
			
			if(sentence.charAt(i)== ' '){	
				wordcount++;
			}
			
		}
		
		System.out.println(" The number of words in the  String: " +wordcount);
		
		scanner.close();

	}

}
