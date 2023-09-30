package Assignment_1;

public class question_12 {

	public static void main(String[] args) {
	/*Write a program to check palindrome (MalayalaM) 
	 *for both numbers and string?
	 */
		
  String s = "MalayalaM";
  String s1= "123454321";
  
  String rev ="";
  
  int len = s.length();
  
  for (int i=len-1;i>=0; i--){

	  rev = rev+s.charAt(i);
  }
		  
  if(s.equals(rev)) {
	  
	  System.out.println(s+" is a Palindrom");
  }
  else {
	  
	  System.out.println(s+ " is not a Palindrom");
  }
  
  System.out.println();
  
int length = s1.length();
  
  for (int i=length-1;i>=0; i--){

	  rev = rev+s1.charAt(i);
  }
		  
  if(s.equals(rev)) {
	  
	  System.out.println(s1+" is a Palindrom");
  }
  else {
	  
	  System.out.println(s1+ " is not a Palindrom");
  }
  				
	}

}
