package Lesson2;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
	//HashSet hs = new HashSet(100); //(initial capacity
	
	//HashSet hs = new HashSet(100,(float)0.90);
	
	//HashSet <Integer> ha = new HashSet <Integer> ();
	
     HashSet hs = new HashSet(); //default initial capacity 16 load factor o.75 
		
		
		// Add object/elements into HashSet
     
     hs.add("Welcome");
     hs.add(15.5);
     hs.add('A');
     hs.add(true);
     hs.add(null);
     
     System.out.println(hs);//insertion order not preserved
     System.out.println();
     
     //remove()
     hs.remove(15.5);
     System.out.println(hs);//After remove special value
     System.out.println();
     
     // no get set method
     
     //contains()
     
     System.out.println(hs.contains('A'));
     System.out.println();
     
     //is empty
     System.out.println(hs.isEmpty());
     System.out.println();
     
     //reading object or elements using for each loop
     
     for(Object e:hs)
     {
    	 System.out.println(e);
     }
     
     // Iterator method 
     Iterator it = hs.iterator();
     while(it.hasNext());
     {
    	 System.out.println(it.hasNext());
     }
     
     
		
		
		
	}

}
