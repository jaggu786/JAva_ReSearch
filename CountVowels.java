package Freshers;

import java.util.Scanner;

public class CountVowels
{
  public static void main(String[] args)
  
  {
	  
	  String word;
		Scanner myinput = new Scanner(System.in);

		System.out.println("Please enter a word.");
		word = myinput.next();
		char[] wordc = word.toCharArray();

		int vowels = 0;

		for (char w: wordc) {
		    if(w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
		        vowels++;
		    }
		}

		System.out.println("Number of vowels in " + word + " is: " + vowels);
		System.out.println("Number of consonants in " + word + " is: " + (wordc.length - vowels));
		
		
	
}
	
	
	
	
}
