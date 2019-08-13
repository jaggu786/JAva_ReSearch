package Freshers;

public class FactorialOfNumber 
{
	
	
public static void main(String[] args)
{
	
	  int  n= Factorial(5);
	  System.out.println(n);	
}

private static int  Factorial(int num) 
{
	if(num<=1)
	{
		return 1;
	}
	else
	{
		return (num*Factorial(num-1));
	}
	}
}
