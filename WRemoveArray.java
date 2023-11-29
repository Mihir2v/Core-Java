/*• Write a Java program to remove the third element from an array list. 
*/
package corejb;

import java.util.ArrayList;

public class WRemoveArray {
	public static void main(String[] args) {
		
	
	 ArrayList<String> myList = new ArrayList<>();

     // Add some elements to the ArrayList
     myList.add("Apple");
     myList.add("Banana");
     myList.add("Orange");
     myList.add("Grapes");

     // Display the original list
     System.out.println("Original list: " + myList);
     int indexToRemove = 2;
     if (indexToRemove >= 0 && indexToRemove < myList.size()) {
         myList.remove(indexToRemove);
         System.out.println("List after removing element at index " + indexToRemove + ": " + myList);
     } else {
         System.out.println("Invalid index. Please provide a valid index.");
     }
	}

}
