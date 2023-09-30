package Assignment_1;

public class question_16 {

	public static void main(String[] args) {
		
		/*Write a method that will remove
		 * given character from the String:	
		 */
		
	String name = "Anj-an a";
	
	int i = 0;
	
	while(i<name.length()) {
		char ch = name.charAt(i);
		if(ch == ' ' || ch == '-' ) {
			
			String before =name.substring(0, i);
			String after =name.substring(i +1);
			
			name = before+after;			
		}
		
		else {
			i++;
		}
	}
			
	System.out.println(name);			
	}

}
