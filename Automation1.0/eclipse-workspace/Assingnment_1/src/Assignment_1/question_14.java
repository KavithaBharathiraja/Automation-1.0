package Assignment_1;

public class question_14 {

	public static void main(String[] args) {
		
/*Given a string print the reverse
 *  of the words string.
 *  (Input: Java Code Output: Code Java)
 */
		
		String s = "Java Code";
		String s1 = " ";
		String a[] =s.split(" ");
			
		System.out.println("input : Java Code");
		System.out.println();
		
		for(int i = 0; i<a.length;i++) {
						
		}
		System.out.println();
		
		for(int i = a.length-1; i>=0;i--) {
			
			s1 =s1 +a[i]+ " ";
					
		}
		System.out.print("output :"+ s1);
	}

}
