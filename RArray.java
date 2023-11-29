/*Write a Java program to create a new array list, add some colors (string) and print out 
the collection. */
package corejb;

import java.util.ArrayList;

public class RArray {
	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<>();
		
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Violet");
		colorList.add("Green");
		colorList.add("Yello");
		
		System.out.println("Color in the ArrayList");
		
		for(String color : 	colorList) {
			System.out.println(color);
		}
	}
}
