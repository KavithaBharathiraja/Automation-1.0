package StingAssignments;

public class QuestionNumber3 {

	public static void main(String[] args) {
		// WJP to replace each substring String "Dog chases cat ,
		// cat chases rat" replace cat with rat.

		String str = "Dog chases cat , cat chases rat";
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't')
			{
				newStr += "rat";
				i += 2;
			} else {
				newStr += ch;
			}
		}
		System.out.println(newStr);
	}
}
