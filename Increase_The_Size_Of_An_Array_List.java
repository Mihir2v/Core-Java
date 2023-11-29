// Write a Java program to increase the size of an array list
package corec;

import java.util.ArrayList;

public class Increase_The_Size_Of_An_Array_List {
			
	 public static void main(String[] args) {
         ArrayList<String> c1= new ArrayList<String>(3);
         c1.add("Hello");
         c1.add("Students");
         System.out.println("Original array list: " + c1);
 
         c1.ensureCapacity(6);
         c1.add("Welcome");
         c1.add("To");
         c1.add("Tops");
         c1.add("Technology");

         System.out.println("New array list: " + c1);
  }

}
