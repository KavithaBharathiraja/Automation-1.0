package Interviewquestions1;

public class onetohundredwithoutloops {

	public static void main(String[] args) {
		printNum(1);
		printnumber(1, 100);
		
		//IntSteam.range(1, 101).forEach(e -> System.out.println(e));
	}
	
	
	
	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
			
		}
	}		
    public static void printnumber(int startnum,int endnum) {
    	
    	if(startnum<=endnum) {
    		System.out.println(startnum);
    		startnum++;
    		printnumber(startnum,endnum);
    		
    	}
    	
    	
    	
    }
		
		
		
	
	
	
	
	

}
