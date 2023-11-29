/*W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True*/
package corej;

public class PEndString {

	public static void main(String[] args) {
		String str1="Java Exercises";
		String str2="Java Exercise";
		String end_str="se";
		Boolean end1= str1.endsWith(end_str);
		Boolean end2= str2.endsWith(end_str);
		System.out.println("\"" + str1 + "\" ends with " +
	            "\"" + end_str + "\"? " + end1);
		System.out.println("\"" + str2 + "\" ends with " +
	            "\"" + end_str + "\"? " + end2);
	}
}
