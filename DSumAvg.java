/*Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.*/
package corej;

import java.util.Scanner;

public class DSumAvg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		int number;
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter Number : ");
			number=sc.nextInt();
			sum+=number;	
		}
		double average = (double) sum / 5;
		System.out.println("Sum :"+sum);
		System.out.println("Average : "+average);
	}
}
