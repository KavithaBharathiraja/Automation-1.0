package JavaHomework;

public class day2exercise {

	public static void main(String[] args) {
		int rows = 5;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println();
        
  
        
        for (int i=1; i<= rows; i++) {
        	for (int j=1; j<= columns; j++) {
        		System.out.print(i);
        	}
        	System.out.println();	
        }
	 
         System.out.println();
         int R = 5;

         for (int i = 1; i <= R; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j);
             }
             System.out.println();
         }
         
         System.out.println();
         
         int C=5;
         
         for (int i = 1; i <= C; i++) {
             for (int j = 1; j <= C; j++) {
                 System.out.print(i);
             }
             System.out.println();
         }
         
         System.out.println();
	}
		}
