package Lesson1;
import java.util.ArrayList;
import java.util.Collection;

public class collections {

	public static void main(String[] args) {
	   
		//collection is an interface
		
		
	// create a collection (ArrayList) to store strings
		
	Collection<String>names = new ArrayList<>();
	names.add("Anju");
	names.add("Adhi");
	names.add("Anbu");
	names.add("Arivu");
		
		
	// Get the Size of the collection
	int size = names.size();
	System.out.println("Size of the collection: "+size);
	System.out.println();
	
	//check for specific elements
	boolean containsAnju = names.contains("Anju");
	System.out.println("Contains Anju? " +containsAnju);
	System.out.println();
	
	// remove  specific element
	names.remove("Anbu");
	System.out.println("names eithout anbu: "+names);
	System.out.println();
	
	//Iterate over the elements
	for(String name : names) {
		System.out.println(name);
	}
	System.out.println();
	
		//clear the collection 
	names.clear();
	System.out.println();
	
	// check if the collection is empty?
	
	boolean isEmpty = names.isEmpty();
	System.out.println("Is the collection empty?\n "+isEmpty);
		
		

	}

}
