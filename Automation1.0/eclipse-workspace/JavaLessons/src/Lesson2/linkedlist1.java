package Lesson2;
import java.util.LinkedList;
import java.util.Collections;

public class linkedlist1 {

	public static void main(String[] args) {
	
		
		LinkedList l = new LinkedList();		
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("c");
	
		
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);
		System.out.println();
		
		new_l.removeAll(l);
		System.out.println(new_l);
		System.out.println();
		
		
	    //sorting collection class
		
		System.out.println("before sorting: "+l);
		System.out.println();
		Collections.sort(l);
		
		System.out.println("After sorting: "+l);
		System.out.println();
		
		//reverse
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After reverse order:  "+l);
		System.out.println();
		
		//shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling: "+l);
		System.out.println();

	}

}
