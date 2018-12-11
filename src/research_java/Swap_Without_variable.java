package research_java;

public class Swap_Without_variable {

	public static void main(String[] args) 
	{
	
	swap(100,200);
	
	}

	private static void swap(int i, int j) 
	{
		System.out.println(" before swapping the value of "+i+"the value of j is "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("swapping done i=  "+i+"  j=  "+j);
		
	}

	
}

