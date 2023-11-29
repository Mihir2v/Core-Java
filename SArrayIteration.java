/*• Write a Java program to iterate through all elements in an array list.*/
package corejb;

import java.util.ArrayList;
import java.util.Iterator;

public class SArrayIteration {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();

		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");
		myList.add("PineApple");
		myList.add("Mango");

		System.out.println("Iteration through all elements using for each loop");
		for (String element : myList) {
			System.out.println(element);
		}
		System.out.println("\nIterating Through all element using a traditional for loop");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}
}
