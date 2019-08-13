package Freshers;

import java.util.Stack;

// write a java program to revere a string without using String Api 
public class Reverse_a_String

{
public static void main(String[] args)
{
	getReverseString("ramu");
}

private static void getReverseString(String string)
{
	
char arr[]=string.toCharArray();

Stack<Character>  stk = new Stack<Character>();

for(int i=0; i<arr.length;i++)
{
	stk.push(arr[i]);
}

for(int i=0; i<arr.length;i++)
{
	  System.out.print(stk.pop());
}
	


}
	
	
	
	
}
