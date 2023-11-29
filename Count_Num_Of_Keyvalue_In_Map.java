//Write a Java program to count the number of key-value (size) mappings in a map.

package corec;

import java.util.HashMap;

public class Count_Num_Of_Keyvalue_In_Map {

	 public static void main(String args[]){  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Prabha Shanker");
		  hash_map.put(2, "Mihir");
		  hash_map.put(3, "Tanmay");
		  hash_map.put(4, "Anil");
		  hash_map.put(5, "Bhushan");
		  System.out.println("Size of the hash map: "+hash_map.size());
		 }
}
