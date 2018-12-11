package strings_research;

import java.util.Scanner;

public class Palindrome_stringbuffer 
{

	public static void main(String[] args) 
	{
		
		
		ispalindrome("mad");
		 
		
		
	}
		
		 private static void ispalindrome(String s) {
			 
		String temp=s;
		 
		 
		 
		 StringBuffer  sb= new StringBuffer(s);
		 sb.reverse();
	String ff=	 sb.toString();
	if(temp.equalsIgnoreCase(ff))
	{
		 
		
		
		System.out.println(temp+"  is a palindrome");	 
		
		
		
		

	}
	
	else
	{
		System.out.println(temp+" is  not a palindrome ");
	}
		 }
}
	
