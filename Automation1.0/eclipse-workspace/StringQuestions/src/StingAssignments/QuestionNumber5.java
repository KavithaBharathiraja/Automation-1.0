package StingAssignments;

public class QuestionNumber5 {

	public static void main(String[] args) {
		// WJP to find the number of Integers ,
		// upper case, lower case characters in a given String
		// "Hello Java 8" Integer - 1 upper case - 2 lower case - 7

		String str = "Hello Java 8";
		int intCount = 0;
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') 
			{
				intCount++;
			} else if (ch >= 'A' && ch <= 'Z') 
			{
				upperCount++;
			} else if (ch >= 'a' && ch <= 'z') 
			{
				lowerCount++;
			}
		}
		System.out.println("The number of integers is: " + intCount);
		System.out.println("The number of uppercase characters is: " + upperCount);
		System.out.println("The number of lowercase characters is: " + lowerCount);
	}

}
