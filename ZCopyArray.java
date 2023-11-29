/*• Write a Java program to copy one array list into another. 
*/
package corejb;

import java.util.ArrayList;

public class ZCopyArray {
	public static void main(String[] args) {
		ArrayList<String> sourceList = new ArrayList<>();
		sourceList.add("Apple");
		sourceList.add("Banana");
		sourceList.add("Orange");
		sourceList.add("Grapes");

		// Display the original source list
		System.out.println("Source list: " + sourceList);

		// Create the destination ArrayList
		ArrayList<String> destinationList = new ArrayList<>();

		// Copy elements from the source list to the destination list
		destinationList.addAll(sourceList);

		// Display the copied destination list
		System.out.println("Destination list (copied from source): " + destinationList);
	}

}
