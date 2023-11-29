/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
and by both*/
package corej;

public class LDividenum {
 
	public static void main(String[] args) {
		System.out.println("Number Divided by 3 & 5 : ");
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0)
				System.out.print(i+", ");
	
		}
		System.out.println("\n");
	}

}
