package Lesson2;
import java.util.LinkedList;

public class linkedlisi2 {

	public static void main(String[] args) {
		
		
	LinkedList l = new LinkedList();
	
	l.add("Dog");
	l.add("cat");	
	l.add("dog");	
	l.add("horse");	
	
	System.out.println(l);
	System.out.println();
	l.addFirst("cow");
	System.out.println();
	l.addLast("fox");
	System.out.println();
	
	System.out.println(l);
	System.out.println();
	
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	System.out.println();
	
	l.removeFirst();
	l.removeLast();
	System.out.println();
	

	}

}
