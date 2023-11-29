//Write a Java program to join two array lists
package corec;

import java.util.ArrayList;

public class Join_Two_Array_Lists {
		
	public static void main(String[] args) {
		   ArrayList<String> c1= new ArrayList<String>();
		          c1.add("HI");
		          c1.add("This");
		          c1.add("Is");
		          c1.add("Prabha Shanker");
		          System.out.println("List of first array: " + c1);
		          ArrayList<String> c2= new ArrayList<String>();
		          c2.add("Welcome");
		          c2.add("To");
		          c2.add("Tops");
		          c2.add("Technology");
		          System.out.println("List of second array: " + c2);
		         
		      // Let join above two list
		        ArrayList<String> a = new ArrayList<String>();
		        a.addAll(c1);
		        a.addAll(c2);
		        System.out.println("New array: " + a);
		        

		     }

}
