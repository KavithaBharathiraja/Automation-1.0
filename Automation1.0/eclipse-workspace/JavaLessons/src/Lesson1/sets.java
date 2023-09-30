package Lesson1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class sets {

	public static void main(String[] args) {
		// HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet example
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        System.out.println("TreeSet: " + treeSet);

	}
	
}
