package Freshers;

public class SwapDemo
{

	public static void main(String[] args)
	{
		
		
	swap(10,20);
	
		
	}

	private static void swap(int i, int j)
	{
		
		System.out.println(" the values before swapping:"+i+" "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println(" the values after  swapping:"+i+" "+j); 
		
	}
	
	
}
