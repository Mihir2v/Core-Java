//Write a Java program to get the number of elements in a hash set
package corec;

import java.util.HashSet;

public class Get_The_Number_Of_Elements_In_A_Hash_Set {
		
	public static void main(String[] args) {
        // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
 
         h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
   System.out.println("Original Hash Set: " + h_set);
   System.out.println("Size of the Hash Set: " + h_set.size());
  }

}
