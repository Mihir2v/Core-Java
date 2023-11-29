//Write a Java program to convert a hash set to an array.
package corec;

import java.util.HashSet;

public class Convert_Hash_Set_To_An_Array {
			
	public static void main(String[] args) {
        // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
  // use add() method to add values in the hash set
         h_set.add("Hi");
         h_set.add("Welcome");
         h_set.add("To");
         h_set.add("Tops");
         h_set.add("techonology");
     System.out.println("Original Hash Set: " + h_set);
     // Creating an Array
     String[] new_array = new String[h_set.size()];
     h_set.toArray(new_array);

    // Displaying Array elements
    System.out.println("Array elements: ");
     for(String element : new_array){
       System.out.println(element);
    }
  }

}
