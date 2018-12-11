package ExceptionHandling;

public class Sample 
{

	static void demo() 
	{
		try
		{
			System.out.println("Inside Demo");
			
			throw new NullPointerException(" Exception details");
			
			
		}
		catch (NullPointerException ne)
		{
			
		System.out.println(ne);
		
		{
			
		}
		
		}
	}
	
}



