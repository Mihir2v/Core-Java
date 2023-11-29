/*• Write a Java program to update specific array element by given element. 
*/
package corejb;

import java.util.ArrayList;

public class VupdateArray {

	public static void main(String[] args) {
		 ArrayList<String> myList = new ArrayList<>();

	        myList.add("Apple");
	        myList.add("Banana");
	        myList.add("Orange");
	        myList.add("Grapes");
	        
	        System.out.println("Original List"+myList);
	        
	        int indexToUpdate = 1;
	        String newElement = "Pineapple";

	        if (indexToUpdate >= 0 && indexToUpdate < myList.size()) {
	            myList.set(indexToUpdate, newElement);
	            System.out.println("List after updating element at index " + indexToUpdate + ": " + myList);
	        } else {
	            System.out.println("Invalid index. Please provide a valid index.");
	        }
	}

}
