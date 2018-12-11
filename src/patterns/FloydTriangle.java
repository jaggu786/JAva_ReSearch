package patterns;

public class FloydTriangle 
{

	public static void main(String[] args) 
	{
		
  printfloyd(9,9);
 
  
  
  
	}

	

	

	private static void printfloyd(int row, int col ) 
	{
		int n=1;
		
		for(int i=1;i<=row;i++) 
		{
			
			for(int j=1;j<=i;j++)
			{
				 System.out.print(n+" ");
				 ++n;
				  
			}
			System.out.println();
		}
		
	}

}
