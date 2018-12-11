package ExceptionHandling;

import java.util.Scanner;

public class MultipleExceptionHandling 
{

	public static void main(String[] args) 
	{
		int a = 0;
		  System.out.println("enter   number to be divided");
			 Scanner sc= new Scanner(System.in);
			 
			 int n= sc.nextInt();
			 try
			 {
			 a=56/n;
			 
			 int g[] = {10,20,30};
			  g[50]=100;
			  
			  
			 }
			 catch (ArithmeticException e)
			 {
		      e.printStackTrace();

			 }
			 catch(ArrayIndexOutOfBoundsException ae)
			 {
				 ae.printStackTrace();
			 }

 finally 
 {
	 System.out.println(a); 
	 
	 
 }
		
		
		
	}
}


	


