/*• Write a Java program to sort a given array list. 
*/
package corejb;

import java.util.ArrayList;
import java.util.Collections;

public class YSortArray {
public static void main(String[] args) {
	  ArrayList<Integer> myList = new ArrayList<>();

      // Add some elements to the ArrayList
      myList.add(5);
      myList.add(2);
      myList.add(8);
      myList.add(1);
      myList.add(7);

      // Display the original list
      System.out.println("Original list: " + myList);

      // Sort the ArrayList
      Collections.sort(myList);

      // Display the sorted list
      System.out.println("Sorted list: " + myList);
  }
}
	


