/**
 * 
 */
/**
 * @jagadeesh 
 *
 */
package ExceptionHandling;

import java.util.Scanner;

class ExceptionHandling_Demo
{
	
	

	public static void main(String[] args) throws Exception
	{
		
	int a = 0;
  System.out.println("enter   number to be divided");
	 Scanner sc= new Scanner(System.in);
	 
	 int n= sc.nextInt();
	 try
	 {
	 a=56/n;
	 }
	 catch (Exception e)
	 {
      e.printStackTrace();

	 }
	 
	 finally
	 {
		 
	 
	 System.out.println(a);
	 }
	

	
	
	
	}
	
	
}