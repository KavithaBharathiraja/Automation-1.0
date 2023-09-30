package Assignment_1;
import java.util.*;
public class question_17 {
// to find total number of integers,uppercase and lowercase character in the give string
				//finding upper case:
	int countUpper(String str) 
	{   int count = 0;
		int length = str.length();
		for(int i = 0; i<length; i++)
	{		
			char ch = str.charAt(i);		
			if(ch >='A' && ch<='Z')
	{count++;}
	}
	return count;	
	}	
	//finding lower case:
		int countLower(String str) {	
			int count = 0;
			int length = str.length();
			for(int i = 0; i<length; i++) {
				char ch = str.charAt(i);
				
				if(ch >='a' && ch<='z') {
					count++; }
			}
		return count;}	
		//finding upper case:
		int countDigits(String str) {		
			int count = 0;
			int length = str.length();
			for(int i = 0; i<length; i++) {			
				char ch = str.charAt(i);		
				if(ch >='0' && ch<='9') {
					count++;}
			}
		return count;		
		}		
		
public static void main(String[] args) {					
Scanner scanner = new Scanner(System.in);
question_17 obj = new question_17();
System.out.print("Enter a String:"+ " ");
String str = scanner.next();

System.out.println("Number of upper case: "+obj.countUpper(str));
System.out.println();
System.out.println("Number of lower case: "+obj.countLower(str));
System.out.println();
System.out.println("Number of digits: "+obj.countDigits(str));

scanner.close();

}

	
	}
	


