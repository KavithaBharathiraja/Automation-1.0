package Assignment_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class question_33 {

	public static void main(String[] args) {
	/*A circus is designing a tower routine consisting 
	 * of people standing atop one another’s shoulders.
	 * For practical and aesthetic reasons, each person 
	 * must be both shorter and lighter than the person below
	 * him or her. Given the heights and weights of each person
	 * in the circus, write a method to compute the largest
	 * possible number of people in such a tower. 
	 *  EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
	 *  Output: The longest tower is length 6 and includes from top to bottom: (56, 90)
	 *  (60,95) (65,100) (68,110) (70,150) (75,190) 
	 */
	}
		class Person {
		    int height;
		    int weight;

		    public Person(int height, int weight) {
		        this.height = height;
		        this.weight = weight;
		    }

		    public String toString() {
		        return "(" + height + "," + weight + ")";
		    }
		
		
		        ArrayList<Person> people = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        // Read input values
		        System.out.println("Enter input values in the format (ht, wt):");
		        while (scanner.hasNext()) {
		            String input = scanner.next();
		            if (input.equals("quit")) {
		                break;
		            }
		            String[] values = input.replaceAll("[()]", "").split(",");
		            int height = Integer.parseInt(values[0]);
		            int weight = Integer.parseInt(values[1]);
		            Person person = new Person(height, weight);
		            people.add(person);
		        }

		        // Sort the ArrayList based on height and weight
		        Collections.sort(people, new Comparator<Person>() {
		            public int compare(Person p1, Person p2) {
		                if (p1.height != p2.height) {
		                    return Integer.compare(p1.height, p2.height);
		                } else {
		                    return Integer.compare(p1.weight, p2.weight);
		                }
		            }
		        });

		        // Print the sorted ArrayList
		        System.out.println("Output:");
		        for (Person person : people) {
		            System.out.print(person + " ");
		        }
	}

}
