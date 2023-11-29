/*• Write a Java program to retrieve an element (at a specified index) from a given array 
list.*/
package corejb;

import java.util.ArrayList;

public class UGetElementA {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("cat");
		myList.add("dog");
		myList.add("rat");
		System.out.println("Orignal List" + myList);

		int Retrieve = 2;
		if (Retrieve >= 0 && Retrieve < myList.size()) {
			String RetrieveElement = myList.get(Retrieve);
			System.out.println("Element at index" + Retrieve + ":" + RetrieveElement);

		} else {
			System.out.println("invalid index,please provide a valid index");
		}
	}
}
