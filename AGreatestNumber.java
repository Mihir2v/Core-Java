/*Write a Java program to Take three numbers from the user and print the greatest 
number*/
package corej;

import java.util.Scanner;

public class AGreatestNumber {
	 public static void main(String[] args) {
		int a,b,c;
		
		 Scanner sc=new Scanner(System.in);
		
		 
		 System.out.println("Enter A");
		 a=sc.nextInt();
		 
		 System.out.println("Enter B");
		 b=sc.nextInt();
		 
		 System.out.println("Enter C");
		 c=sc.nextInt();
		 
		 if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("The Greater Number is A = "+a);
			 }
			 else
			 {
				 System.out.println("The Greater Number is C = "+c);
			 }
		 }
		 else if(b>c)
		 {
			 System.out.println("The Greater Number is B = "+b);
		 }
		 else
		 {
			 System.out.println("Greater Number is C = "+c);
		 }
	}

}
