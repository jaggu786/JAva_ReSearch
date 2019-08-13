package Freshers;

public class Factors_of_Number 
{
	  public static void main(String[] args)
	  
    {
		 for(int i=1;i<=100;i++)
		 {
			 getFactorsOf(i);
			 System.out.println();
		 }
			 
			
			

		    
		  
		  
	}

	private static void getFactorsOf(int number)
	{
		 System.out.print("Factors of " + number + " are: ");
	     for(int i = 1; i <= number; ++i) 
	     {
	         if (number % i == 0) {
	             System.out.print(i + " ");
	         }
	     }
		
	}
	  
	

}
