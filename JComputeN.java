/* Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn.*/
package corej;

import java.util.Scanner;

public class JComputeN 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N :");
		n=sc.nextInt();
		System.out.printf("%d , %d%d , %d%d%d ",n,n,n,n,n,n);
				
	}

}
