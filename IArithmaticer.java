/*• W.A.J. P to demonstrate try catch block, 
• Take two numbers from the user and perform the division operation and handle 
Arithmetic Exception. O/P- Enter two numbers: 10 0 
*/
package corejb;

import java.util.Scanner;

public class IArithmaticer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	try {
		int result= num1/num2;
		System.out.println("Result of Division: : "+result);
	} catch (Exception e) {
		System.out.println("Division br Zero is not Allowed");
		
	}
	sc.close();
}
}
