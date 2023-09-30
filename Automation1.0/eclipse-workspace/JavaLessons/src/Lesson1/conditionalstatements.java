package Lesson1;

public class conditionalstatements {

	public static void main(String[] args) {
		
		
     // if condition statement:
		
		//only if condition.
		
		int age =14;
		 
		if(age>=18) 
		{
			
			System.out.println("eligible for vote");
			
		}
		
		System.out.println("program exited");
		System.out.println();
		
		// if-else condition.
		
		
		if(age>=18) 
		{
			System.out.println("eligible for vote");	
		}
		
		else
			
		{
		System.out.println("not eligible for vote");
		System.out.println();
		
		}
		
		//if-esle if condition:
		
		int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
            
        } else if (number < 0) {
            System.out.println("Number is negative");
            
        } else {
            System.out.println("Number is zero");
        }
		
		System.out.println();
		
		
		
		// Nested if...else:
		
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
 			
	
		// Switch case statement:
		
		int Day =78;
		
		
		switch(Day)
		{
		case 1 : System.out.println("Today is Sunday");	
		break;
		case 2 : System.out.println("Today is Monday");
		break;
		case 3 : System.out.println("Today is Tuesday");	
		break;
		case 4 :System.out.println("Today is Wednesday");
		break;
		case 5 :System.out.println("Today is Thursday");
		break;
		case 6 :System.out.println("Today is Friday");	
		
		default:System.out.println("Today is Staurday");
			
	}

}

}