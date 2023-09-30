package Lesson1;

public class stringmethods {

	public static void main(String[] args) {
		
		// String methods:
		
		/*1. Finding Length.
		 * (Calculate the number of String)
		 *2. Concatenation.
		 *(Join the Strings)
		 *3. Equals.
		 *(Compare the Strings)
		 *4. Equals IgnoreCase.
		 *(Compare the Strings -IgnoreCase)
		 *5. Contains.
		 *(Check a String contains another String)
		 *6. Substring.
		 *(Extracting, Subtracting from mainString)
		 *7. Replace.
		 *(Replacing Characters/String within a String)
		 */
		
		//1.Finding Length:
		
		String s ="Anjana";
		
		System.out.println("character in the value= "+s.length());
		
		System.out.println();
		
		//2. Concatenation:
		
		String s1= "Anjana";
		String s2= "is a good girl";
		
		System.out.println(s1+s2);
			System.out.println();
			
		System.out.println(s1.concat(s2));
		    System.out.println();
		    
		System.out.println("Anjana is a good girl");
		     System.out.println();
		     
		System.out.println("Anjana".concat("is a good girl"));
		     System.out.println();
		     
		     
		  //3.Equals:
		     
		   String s3= "ANJANA";
		   String s4= "Anjana";
		   
	    System.out.println(s3.equals(s4));
	          System.out.println();
	          
	       //4.Equals IgnoreCase:  
	          
	    System.out.println(s3.equalsIgnoreCase(s4));      
		       System.out.println();
				   
		    //5. Contains:
		       
		       
		 System.out.println(s3.contains("AN"));      
		     System.out.println();
		     
		 System.out.println(s3.contains("XYZ"));
		     System.out.println();
		     
		     
		     //6. Substring:
		          
	/*
	 * starting index starts from '0'.
	 * ending index starts from '1'.	  
	 */
		
		String s5 = "Reandingisgood";
	
	
	System.out.print(s5.substring(0,8));
	     System.out.println();
	    
	System.out.print(s5.substring(8,10));   
	     System.out.println();
	    
	System.out.print(s5.substring(10,14)); 
	     System.out.println("\n");
	    
	         //7. Replace:
	    
	    String s6 = "Sage";
	    
	 System.out.println(s6.replace('S','C'));
	    System.out.println();
	 
	 System.out.println(s6.replace("age","tage"));
	    System.out.println();
	    
	       

	}

}
