/* Write a Java program to shuffle elements in an array list. */

package corejb;

import java.util.ArrayList;
import java.util.Collections;

public class ZASuffelArray {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Display the original list
        System.out.println("Original list: " + myList);

        // Shuffle the ArrayList
        Collections.shuffle(myList);

        // Display the shuffled list
        System.out.println("Shuffled list: " + myList);
	}
}
