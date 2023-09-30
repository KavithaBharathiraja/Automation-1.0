package Lesson2;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		//Declare linked list 
		LinkedList l = new LinkedList();
		
		//LinkedList<Integer> l = new 	LinkedList<Integer>();
		
		//LinkedList<String> l = new 	LinkedList<IString>();
		
		
		//Add elements
		
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println();
		
		//find the size
		
		System.out.println(l.size());
		System.out.println();
		
		//remove
		l.remove(3);
		System.out.println("linked list after removing:\n "+l);
		System.out.println();
		
		
		//insert/add 
		l.add(3, "to");
		System.out.println("Linked list after instert in aspecific place:\n "+l);
		System.out.println();
		
		//retrieve the value
		System.out.println(l.get(3));
		
		//change the value
		l.set(5, "x");
		System.out.println("Linked list after changing value: "+l);
		System.out.println();
	
		//contains
		System.out.println(l.contains("x"));
		System.out.println(l.contains("Y"));
		System.out.println();
			
		//is empty
		
		System.out.println(l.isEmpty());
		System.out.println();
		
		//reading elements
		
		for(int i = 0; i < l.size(); i ++) 
		{
			System.out.println(l.get(i));
		}
		System.out.println();
		
		//for each loop
		for(Object e:l) 
		{
			System.out.println(l);
		}
		System.out.println();
		
		//Iterator
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) 
		{
		System.out.println(it.next());
		}
		
	}

}
