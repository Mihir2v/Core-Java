/*W.A.J.P to get the character at the given index within the String. Original String = 
Tops Technologies! The character at position 0 is T, The character at position 10 is 
o*/
package corej;

public class MChIndex {

	public static void main(String[] args) {
		String str="Tops Technologies!";
		System.out.println("The Given String is :"+str);
		
		int index1= str.charAt(0);
		int index2= str.charAt(10);
		
		System.out.println("The Character at 0 is :"+(char)index1);
		System.out.println("The Character at 10 is :"+(char)index2);
		
	}
}
