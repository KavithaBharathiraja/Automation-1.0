package Lesson1;

public class twodimensionalArrayforeachloop {

	public static void main(String[] args) {
		
		// Two Dimensional Array for...each loop:	
		
		int e [][]= new int [3][2]; 
		
		e[0][0]= 10;
		e[0][1]= 20;
		
		e[1][0]= 30;
		e[1][1]= 40;
		
		e[2][0]= 50;
		e[2][1]= 60;
		
		for(int i[]:e)
		{
			for(int j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();	
		
		}
		
		System.out.println();
		
		
		
		
		// Two Dimensional Array:
		
		//Classic for loop:
		
		//declaration.
		
		
		
		int d [][]= new int [3][2]; 
		
		
		// storing elements/values:
				
				d[0][0]= 10;
				d[0][1]= 20;
				
				d[1][0]= 30;
				d[1][1]= 40;
				
				d[2][0]= 50;
				d[2][1]= 60;
				
				for(int i=0;i<=2;i++) // incrementing the rows.
				{
				for(int j=0;j<=1;j++) // incrementing the columns.
				   {
					System.out.print(d[i][j]+" ");
				   }
				
				System.out.println();
				
				
				

				
		
				}		
		
	}
}

