package Assignment_1;

public class question_13 {

	public static void main(String[] args) {
/* Given a string print the reverse of the string.
 * (Input: Java Code Output: edoC avaJ)
 */

	String input = "Java Code";
	String revString = " ";
	char ch;
	System.out.println("input : Java Code");
	System.out.println();
	
	for(int i = 0; i<input.length();i++) {
		ch = input.charAt(i);
		revString = ch + revString;	
		
	}
	System.out.println("Out put : " +revString);
	
		
	}

	
	}


