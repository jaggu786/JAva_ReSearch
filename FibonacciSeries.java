// Write a java Program  to Print  Fibonaccci Series  


package Freshers;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
	   
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(" the value of  fibonacci :"+i+" is "+ fib(i));  
		}
		
		 
		
		
		
	}

	
	private static int fib(int n) 
	{
		if (n <= 1) 
	        return n; 
	    return fib(n-1) + fib(n-2); 
	}
	
}
