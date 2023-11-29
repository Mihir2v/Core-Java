//Write a Java program to reverse elements in an array list.
package corec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Elements_In_Array_List {
	
	public static void main(String[] args) {
		  // Creae a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Walk");
		  list_Strings.add("cycle");
		  list_Strings.add("Moped");
		  list_Strings.add("Bike");
		  list_Strings.add("Car");
		  System.out.println("List before reversing :\n" + list_Strings);  
		  Collections.reverse(list_Strings);
		  System.out.println("List after reversing :\n" + list_Strings); 
		 }

}
