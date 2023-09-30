package StingAssignments;

public class QuestionNumber2 {

	public static void main(String[] args) {
		// Check the given word is present in a give String . 
		//String S = "I am learning QA automation testing" word ="QA".

		
		    String S = "I am learning qa automation testing";
		    String word = "qa";
		    int index = -1;
		    for (int i = 0; i < S.length(); i++) {
		      if (S.charAt(i) == word.charAt(0)) {
		        int j = 1;
		        while (j < word.length() && S.charAt(i + j) == word.charAt(j)) {
		          j++;
		        }
		        if (j == word.length()) {
		          index = i;
		          break;
		        }
		      }
		    }
		    boolean isPresent = index != -1;
		    System.out.println("The word " + word + " is present in the string " + S + "? " + isPresent);
		  }
		
			
	}


