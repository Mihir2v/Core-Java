/*• Write a Java program to insert an element into the array list at the first position. 
*/
package corejb;

import java.util.ArrayList;

public class TStoreArrayElement {
	public static void main(String[] args) {
		ArrayList<String> myList= new ArrayList<>();
		myList.add("banana");
		myList.add("orange");
		myList.add("mango");
		
		System.out.println("Original List: "+myList);
		
		String newElement ="Apple";
		myList.add(0,newElement);
		
		System.out.println("List After inserting element At the First Position: "+ myList);
	}
}
