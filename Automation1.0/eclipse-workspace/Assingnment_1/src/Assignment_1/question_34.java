package Assignment_1;

public class question_34 {

	public static void main(String[] args) {
/* method that implements the multiplication operation 
 * using only the addition operator (+):
 */
		
		int a = 10;
		int b = 4;
		
		int product  = multiply (a,b);
		int difference = subtract(a,b);
		
		System.out.println(a + " * "+b+" = " + product);
		
		System.out.println();
		
		
		System.out.println(a + " - "+b+" = " + difference);

	}


public static int multiply(int a, int b) {
		
		int result = 0;
		
		for(int i = 0; i<b; i++) {
			result += a;
		}
	return result;	
}	
		
		private static int subtract(int a, int b) {
			
			return a + negate(b) ;
			
		}		
			
			
private static int negate(int num) {
			
			return multiply(num, -1);
		}



		
	}






