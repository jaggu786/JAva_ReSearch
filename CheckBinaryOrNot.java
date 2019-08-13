package Experienced;

public class CheckBinaryOrNot 
{

	
	
	public static void main(String[] args)
	{
		
		isBinary(12);
		
		
		
	}

	private static void isBinary(int number)
	{
		
	        boolean b= true;
	 
	        int copyOfNumber = number;
	 
	        while (copyOfNumber != 0)
	        {
	            int temp = copyOfNumber%10;   //Gives last digit of the number
	 
	            if(temp > 1)
	            {
	                b= false;
	                break;
	            }
	            else
	            {
	                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
	            }
	        }
	 
	        if (b)
	        {
	            System.out.println(number+" is a binary number");
	        }
	        else
	        {
	            System.out.println(number+" is not a binary number");
	        }
	    }
		
		
		
		
		
	}

