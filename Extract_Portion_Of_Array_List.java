//Write a Java program to extract a portion of an array list.
package corec;

import java.util.ArrayList;
import java.util.List;

public class Extract_Portion_Of_Array_List {
		
	public static void main(String[] args) {
		  
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(0, 2);
		  System.out.println("List of first two elements: " + sub_List);
		 }

}
