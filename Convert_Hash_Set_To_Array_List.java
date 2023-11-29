//Write a Java program to convert a hash set to a List/Array List
package corec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert_Hash_Set_To_Array_List {
		
	public static void main(String[] args) {
        // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
  // use add() method to add values in the hash set
         h_set.add("Hello");
         h_set.add("Students");
         h_set.add("Welcome");
         h_set.add("To");
         h_set.add("Tops");
         h_set.add("Technology");
     System.out.println("Original Hash Set: " + h_set);
   
   // Create a List from HashSet elements
    List<String> list = new ArrayList<String>(h_set);

    // Display ArrayList elements
    System.out.println("ArrayList contains: "+ list);
 }
}
