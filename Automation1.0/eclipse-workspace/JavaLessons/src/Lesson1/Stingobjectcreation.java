package Lesson1;

public class Stingobjectcreation {

	public static void main(String[] args) {
	
		/*What are different ways to create String Object
		 * two ways:
		 * 1. String Literal.
		 * 2. with new keyword.
		 */
		
	// Crating String with Single Literal
		
		String s1 = "one";
		String s2 = "one";
		
	// creating with new Keyword:
	   
	     String s3 =new String("one");
	     String s4 =new String("one");
	     
	     
	     System.out.println(s1 == s2); //check for space
	     System.out.println(s1 == s3);
	     System.out.println(s3 == s4);
	     System.out.println(s1.equals(s3)); //check for value
	     
				
		

	}

}
