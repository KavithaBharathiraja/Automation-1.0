package StingAssignments;

public class QuestionNumber4 {

	public static void main(String[] args) {
		// Given a string print the reverse of the String (Java - avaJ)

		    String str = "Java";
		    String reversedStr = "";
		    
		    for (int i = str.length() - 1; i >= 0; i--) {
		      reversedStr += str.charAt(i);
		    }
		    System.out.println(reversedStr);
		  }
			
		
	}


