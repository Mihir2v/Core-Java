/*W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote*/
package corejb;

public class KmodualUnit {

	public static void main(String[] args) {
		int age = 16;

		try {
			KmodualUnit(age);
			System.out.println("Welcome to vote!");
		} catch (ArithmeticException e) {
			System.out.println("Sorry, you are not eligible to vote.");
			System.out.println(e.getMessage());
		}
	}

	static void KmodualUnit(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age must be 18 or above to vote.");
		}
	}
}
