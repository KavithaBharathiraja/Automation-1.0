package Lesson1;

public class arrays {

	public static void main(String[] args) {
		
		//Single dimensional Array:
	
		
   // Array for limited numbers:
		
		int a[]= new int[5]; // declaration of 5 elements
			// store elements into array	
				a[0] =10;
				a[1] =20;
				a[2] =30;
				a[3] =40;
				a[4] =50;
				
				System.out.println(a[3]);
				System.out.println();
				
				
   // Array for more numbers  'for' loop:
				
				
				a[0] =10;
				a[1] =20;
				a[2] =30;
				a[3] =40;
				a[4] =50;
				
				for(int i=0;i<=4;i++)
				{
					System.out.println(a[i]);
					
				}
				System.out.println();
				
				
	// Array for more numbers  'for...each' loop:
				
				for(int i:a)
				{
					System.out.println(i);
				}
				System.out.println();
				
	// string Array:
				
				String s[] = new String[3];
				
				s[0] = "welcome";
				s[1] = "to";
				s[2] ="training";
				
				System.out.println("leanth= " +s.length);  // return length for an Array
			    System.out.println();
				
				for(String i:s)
				{
					System.out.println(i);
				}
				System.out.println();
				
				
			//store more values:
		
				
				int A[] = {100,200,300,400,500,600};
				
				int sum=0;
				
				for(int i:A)
				{
					System.out.println(i);
					sum=sum+i;	
				}
				System.out.println();
				
				System.out.println("total= " +sum);
				System.out.println();
	/*			
	limitations:
	1.Array	same elements only can use,
	2.limited numbers only.					
   */
				
//object Array:
				
				
				Object b[]=new Object[5];
				
				b[0] = 10;
				b[1] = 120.5;
				b[2] = "Welcome";
				b[3] = 'G';
				b[4] = true;
				
				for(Object i:b)
				{
					System.out.println(i);
				}
				
				System.out.println();
				
	// Unlimited object Array:
				
           Object c[]= {100,2.5,"today",300,'A',1};
				
				for(Object i:c)
				{
					System.out.println(i);
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
