/*Write a Java program that takes a year from user and print whether that year is a leap 
year or not*/
package corej;

import java.util.Scanner;

public class CLeapYear {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter year : ");
		int year =sc.nextInt();
		
		boolean isLeap = false;
		if(year % 400 == 0)
		{
			isLeap = true;
		}
		else if(year % 100 == 0)
		{
			isLeap = false;
		}
		else if(year % 4 == 0)
		{
			isLeap = true;
		}
		
		if(isLeap)
		{
		System.out.println(year+" is a Leap Year.");	
		}
		else
		{
			System.out.println(year+" is Not a Leap Year");
		}
		
	}

}
