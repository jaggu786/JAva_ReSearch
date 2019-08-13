package Freshers;
// Perfect number is a positive integer that is equal to the sum of its proper divisors except itself.

//  example : 6    factors 1 2 3 6     sum other than 6 is 1+2+3=6 
public class PerfectNumberDemo
{
	public static void main(String[] args) 
	{
		
		
		  long number=123;
	long u=	isperfect(number);
	
	
	if(u==number )
	{
		System.out.println("it is a perfect number  ");
		
		
	}
	
	else
	{
		System.out.println("it is  not  a perfect number  ");
	}
	
	
		
	}

	private static long isperfect(long number) 
	{
		
		
		
		int i;
		long sum=0;
		 for( i=1;i<=number/2;i++)
		 {
		       if(number%i==0)
		       {
			sum+=i;
			
		       }
		       
		       
	  	}
		  
		
		 
		 
		 
		   
		
			return sum;
	}
		
}




