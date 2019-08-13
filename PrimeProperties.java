
//A prime number is a whole number greater than 1, which is only divisible by 1 and itself. 

package Freshers;

public class PrimeProperties 
{

	private static int count;

	public static void main(String[] args) 
	{
		
		 boolean  result= isPrime(3);
		 
		System.out.println(" is it a prime ?  :"+ result); 
		
		
	}

	private static Boolean isPrime(int num)
	{
		
		boolean b=false;
		 for(int i=2; i<num; i++)
	        {
	            if(num%i == 0)
	            {
	                count++;
	                
	                break;
	            }
	        }
	        if(count == 0)
	        {
	        	b=true;
	           
	        }
	        else
	        {
	            
	        }
			return b;
		
		
	}
	
	
	
	
}
