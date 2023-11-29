/* Write a Java program to count the letters, spaces, numbers and other characters of 
an input string.*/
package corej;

import java.util.Scanner;

public class HCountLNSC {
	public static void main(String[] args) {
		/*
		 * String test="Mihir@123 .com"; count(test);
		 */
		
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.print("Enter Text Here :");
		a=sc.next();
		
	}
	public static void count(String a)
	{
	    char[] ch = a.toCharArray();
		int space = 0 ;
		int num = 0 ;
		int letter = 0 ;
		int otherchat = 0 ;
	
	for(int i=0;i < a.length(); i++ )
	{
		if(Character.isLetter(ch[i]))
		{
			letter ++;
		}
		else if(Character.isDigit(ch[i]))
		{
			num ++;
		}
		else if(Character.isSpaceChar(ch[i]))
		{
			space ++;
		}
		else 
		{
			otherchat++;
		}
	}
		System.out.println("The String is :" +a);
		System.out.println("Letters : "+letter);
		System.out.println("Space : "+space );
		System.out.println("Number : "+num);
		System.out.println("Special Character : "+otherchat);
	}
	
}
