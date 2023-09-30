package Lesson2;
import java.util.*;
public class collectionframework {

	public static void main(String[] args) {
		//Array list
		
		//declare Arraylist
		
		//ArrayList al = new ArrayList();
        //ArrayList<Integer> al = new ArrayList<Integer>();
        //ArrayList<Stringr> al = new ArrayList<stringr>();
		// List al = new ArrayList();
		
		ArrayList al = new ArrayList();
				
	//Add new elements to the ArrayList	
	
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println("Original Array List:\n" + al);
		
		System.out.println();
		
	//size of the ArrayList	
		System.out.println("number od elements of the Arraylist:\n"+al.size());
		System.out.println();
		
	//remove the element from ArrayList: 	
		al.remove(2);	//(2)index
		System.out.println("number od elements of the Arraylist after remove index2:\n"+al);
		System.out.println();
		
	//insert new element
		al.add(2, "15.5");
		System.out.println("number od elements of the Arraylist after adding in aspecific index:\n" +al);
		System.out.println();
	
	//retrieve a special element
		System.out.println(al.get(1));
		System.out.println();
		
	//change a specific element
		al.set(2, "to");
		System.out.println("Arraylist after replace index 2(15.5) in to (to)" +al);
		System.out.println();
	// search/check for the element
		
		System.out.println(al.contains("true"));
		System.out.println();
		System.out.println(al.contains("false"));
		System.out.println();
		
	//is empty
		System.out.println(al.isEmpty());
		System.out.println();
	
	//read the Arraylist
		
		/*1.for loop
		 * 2.for each loop
		 * 3.iterator
		 */
		
	// for loop
		
		System.out.println("Reaging the elemends of the Arraylist using for loop:");
		
		for(int i =0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		System.out.println();
   // for each loop
		System.out.println("Reaging the elemends of the Arraylist using for each loop");
		for(Object e:al) {
			
			System.out.println(e);
		}
		System.out.println();
		
		// Iterator
		
		System.out.println("Reaging the elemends of the Arraylist using Iterator");
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		
		
	}
	
	

}
