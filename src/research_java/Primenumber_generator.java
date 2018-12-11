package research_java;

import java.util.Scanner;

public class Primenumber_generator 
{

	private static int s1;
	private static int num;

	public static void main(String[] args) 
	{
		System.out.println(" enter how many prime numbers you want ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(" these are  the first  "+n+" prime numbers");
	
		generate_prime_upto(n);
		  
		
		
	}

	private static void generate_prime_upto(int max) 
	{
		   s1=1; num=2;
	
		
		while(s1<=max)
		{
			if(isprime(num))
			{
				
				
				++s1;
				
			}
			  
		++num;
		}
		
		
		
	}

	private static  boolean isprime(int num) 
	
	{
		
		
	
boolean b=true;
for(int i=2 ;i<=num-1;i++)
{
	  
	// if any number divides num  then it is not prime 
	  if(num%i==0)
	  {
		 
		  
		   
		   b=false;
	  } 
	
}
if(b==true)  
{
	 System.out.println(num +" "); 
	
}


return b;

		
		
		
		
			
	
	
	
		
		
	}

	

	

}