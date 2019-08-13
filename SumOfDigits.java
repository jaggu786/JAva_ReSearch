package Freshers;

public class SumOfDigits {

	public static void main(String[] args) 
	
	{

    get_SumOfDigits_of_Number(567);

	}

	private static void get_SumOfDigits_of_Number(int m)
	{
		
		 System.out.println("Sum of Digits of "+m +" is ");
		int sum=0;
		int n;
		  while(m > 0)
	        {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	        }
	        System.out.println(sum);
	    }
		
	}


