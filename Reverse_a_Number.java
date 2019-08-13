package Freshers;

public class Reverse_a_Number
{
	
	public static void main(String[] args) 
	{
		
	int n=	getReverse(234); 
	
	System.out.println(n);
		
		
	}
	private static int getReverse(int num) 
	{
		int reversed = 0;
		 while(num != 0) 
		 {
			 
		        int digit = num % 10;
		        reversed = reversed * 10 + digit;
		        num /= 10;
		    }
		return reversed;
		
		
	}
	
	 
}
