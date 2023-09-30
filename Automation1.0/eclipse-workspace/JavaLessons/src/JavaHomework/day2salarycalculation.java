package JavaHomework;
import java.util.*;
public class day2salarycalculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* MNC company has decided to revise the salary of its employees on some conditions mention below
 * -If the employee’s working experience is between 3 to 5, Revised salary = old salary + 10%of old salary
 * -if the employee’s working experience is between 6 to 9, Revised salary = old salary + 15%of old salary
 *-if the employee’s working experience is between 10 to20, Revised salary = old salary + 20%of old salary
 *-for others, Revised salary = old salary + 25%of old salary 
 *-And they have received any reward from the company, Rs. 1000/- 
 *is added to revised salary for each reward.
 */
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee's old salary: ");
		double oldSalary = scanner.nextDouble();
		
		System.out.println("Enter Employee's working expreiance: ");
		int experience = scanner.nextInt();
		
		System.out.println("Enter number of rewards recevied by the employee:");
		int rewards = scanner.nextInt();
		
		double RevisedSalary =0;
		
		if (experience>=3 && experience<=5){
			RevisedSalary= oldSalary+(oldSalary*10/100);	
		} else if (experience >= 6 && experience <= 9){
            RevisedSalary = oldSalary +  (oldSalary*15/100);
		} else if (experience >= 6 && experience <= 9) {
			RevisedSalary = oldSalary + (oldSalary*20/100);
		}else {
			RevisedSalary =oldSalary + (oldSalary*25/100);
		}
		
		RevisedSalary = rewards*1000;
		
		System.out.println("Revised Salary: " +RevisedSalary);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
