/*• Write a Java program to search an element in an array list. 
*/
package corejb;

import java.util.ArrayList;

public class XSearchArray {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Display the original list
        System.out.println("Original list: " + myList);

        // Search for a specific element
        String elementToSearch = "Banana";
        if (myList.contains(elementToSearch)) {
            System.out.println("Element '" + elementToSearch + "' found in the list.");
        } else {
            System.out.println("Element '" + elementToSearch + "' not found in the list.");
        }
	}

}
