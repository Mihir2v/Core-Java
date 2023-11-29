/*W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False*/
package corej;

public class QStartString {

	public static void main(String[] args) {
		String str1="Red is Favorite Color";
		String str2="Orange is also my favorite color";
		String startstr="Red";
		Boolean start1= str1.startsWith(startstr);
		Boolean start2= str2.startsWith(startstr);
		System.out.println("\"" + str1 + "\" Starts with " +
	            "\"" + startstr + "\"? " + start1);
		System.out.println("\"" + str2 + "\" Starts with " +
	            "\"" + startstr + "\"? " + start2);
	}
}
