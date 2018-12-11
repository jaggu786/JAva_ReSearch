package research_java;

import java.util.Scanner;

public class Recursion_concept 
{

	public static void main(String[] args) 
	{
		
	System.out.println(" FACTORIAL FOR ??");
		Scanner sc=new Scanner(System.in);
		
		
		int g= sc.nextInt();
		
		
		
		
		 int h=Factorial_Recursion(g);
		 System.out.println(" the factorial for "+g +" is "+ h);
		 
		
		
		

	}

	private static int Factorial_Recursion(int f)
	{
		  if(f==0)
		  {
			    return 1;
		  }
		  else 	return  f*Factorial_Recursion(f-1);
		  
		
	}

	
}