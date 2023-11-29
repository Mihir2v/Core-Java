/*• Write a Java program to append the specified element to the end of a hash set. */
package corejb;

import java.util.HashSet;

public class ZZApeandArray {
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<>();

        // Add some elements to the HashSet
        myHashSet.add("Apple");
        myHashSet.add("Banana");
        myHashSet.add("Orange");

        // Display the original set
        System.out.println("Original HashSet: " + myHashSet);

        // Append a specified element to the end of the HashSet
        String elementToAppend = "Grapes";
        myHashSet.add(elementToAppend);

        // Display the HashSet after appending the element
        System.out.println("HashSet after appending '" + elementToAppend + "': " + myHashSet);
	}
}
