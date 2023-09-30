package JavaHomework;

public class Javahomeworkday1 {

	public static void main(String[] args) {
		
    /* to print the result of the following operations

		  a. -5+8*6
		  b. (55+9)%9
		  c. 20+-3*5/8
		  d.5+15/3*2-8%3
    */
		
	// a. -5+8*6
		
		int a = -5;
		int b = 8;
		int c = 6;
		
		System.out.println(a+b*c);
		System.out.println();
		
		
	//b. (55+9)%9
		
		float A = 55;
		float B = 9;
		float C = 9;
		
		System.out.println((A+B)%C);
		System.out.println();
		
	// c. 20+-3*5/8
		
		double d =20;
		double e =-3;
		double f =5;
		double g =8;
		
		System.out.println(d+e*f/g);
		System.out.println();
		
	// d. 5+15/3*2-8%3
		
		int h = 5;
		int i = 15;
		int j = 3;
		int k = 2;
		int l = 8;
		int m = 3;
		
		System.out.println(h+i/j*k-l%m);
		System.out.println();
				
		
		/*
		 * to print the sum(addition),multiply,divide and 
		 * remainder of two numbers:
		 */
		
		int one= 10;
		int two= 20;
		
		
		System.out.println(one+two);
		System.out.println(one-two);
		System.out.println(one*two);
		System.out.println(one/two);
		System.out.println(one%two);
			
		System.out.println();
		
    //to print the area(π r²)and perimeter(2π r) of a circle:
		
		double radious= 2;
		double perimeter=2*Math.PI*radious;
		double area=Math.PI*radious*radious;
		
	 System.out.println("perimeter is: "+perimeter);
	 System.out.println("area is: "+area);
	 System.out.println();
	 
   /*
    * to print the area(width*height)and
    * perimeter(2*(width*height)) of a rectangle:
    */
	 
	 double height=2;
	 double width= 3;
	 double Area= width *height;
	 double Perimeter= 2* (width *height);
	
	System.out.println("perimeter is: "+Perimeter);

	
	System.out.println("area is: "+Area);
	System.out.println();
	 
	// to swap two variables:
	
	int x= 10;
	int y= 20;
	
	System.out.println("value of a before swapping:"+x);
	System.out.println("value of b before swapping:"+y);
	
	System.out.println();
	
	int z;
	
	z=x;
	x=y;
	y=z;
	
	System.out.println("value of a after swapping:"+x);
	System.out.println("value of b after swapping:"+y);
	
	System.out.println();
	
	// Demonstrate the use of if, if-else and switch statement:
	
	 // if condition statement:
	
	
	int age =20;
	 
	if(age>=21) 
	{
		
		System.out.println("eligible for Marriage");
		
	}
	
	System.out.println("program exited");
	System.out.println();
	
	// if-else condition.
	
	if(age>=21) 
	{
		System.out.println("eligible for Marriage");	
	}
	
	else
		
	{
	System.out.println("not eligible for Marriage");
	System.out.println();
	
	}
	
	// Switch case statement:
	
	int Month =7;
			
			
	switch(Month)
			{
	case 1 : System.out.println("This month is January");	
	break;
	case 2 : System.out.println("This month is February");
    break;
	case 3 : System.out.println("TThis month is March");	
	break;
	case 4 :System.out.println("This month is April");
	break;
	case 5 :System.out.println("This month is May");
	break;
	case 6 :System.out.println("This month is June");	
	break;
	case 7 :System.out.println("This month is July");	
	break;
	case 8 :System.out.println("This month is August");	
	break;
	case 9 :System.out.println("This month is September");	
	break;
	case 10 :System.out.println("This month is October");	
	break;
	case 11 :System.out.println("This month is November");	
	break;
			
			
	default:System.out.println("This month is December");
				
	   System.out.println();
	         
	         
   /*to find largest of the number using:
	* 1. if-else if.
	* 2. Nested if.
    */
	
	 // if-else if:
	         
	   int number = 10;

       if (number > 0) {
           System.out.println("Number is positive");
           
       } else if (number < 0) {
           System.out.println("Number is negative");
           
       } else {
           System.out.println("Number is zero");
       }
		
		System.out.println();
		     
	                
	 // Nested if:
	 		
		int day =5;
 		
 		if(day==1) 
 		{	
 		System.out.println("Today is Sunday");				
 		}
 		
 		else if(day==2) 
 		{	
 		System.out.println("Today is Monday");				
 		}
         else if(day==3) 
        {	
 		System.out.println("Today is Tuesday");				
 		}
         else if(day==4)
        {	
 		System.out.println("Today is Wednesday");				
 		}
         else if(day==5) 
        {	 
        System.out.println("Today is Thursday");				
 		}  
         else if(day==6) 
        {
  		System.out.println("Today is Friday");				
  		}
          else 
         {
  		 System.out.println("Today is Staurday");				
  		 }
 		
 		System.out.println();
 	
	 
	}
	}
}
