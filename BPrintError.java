/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/
package corej;

import java.util.Scanner;

public class BPrintError {
	private static char character;

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a single character: ");
	        String input = scanner.nextLine();

	        if (input.length() != 1) {
	            System.out.println("Error: Please enter a single character.");
	        } else {
	            char character = input.charAt(0);

	            if (Character.isLetter(character)) {
	                character = Character.toLowerCase(character);
	                if (isVowel(character)) {
	                    System.out.println("Vowel");
	                } else {
	                    System.out.println("Consonant");
	                }
	            } else {
	                System.out.println("Error: Input is not a letter.");
	            }
	        }
	    }

	    private static boolean isVowel(char character) {
	        character = Character.toLowerCase(character);
	        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
	    }
	}

