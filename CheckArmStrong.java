package Experienced;

public class CheckArmStrong 
{

	public static void main(String[] args) 
	{
		
	int number=153;
	System.out.println(number+" is "+" Armstrong  ?");
		
	boolean  t=	isArmStrong(number);
	
	System.out.println(t);
		
		
	}
	
	
	 private static boolean isArmStrong(int number) {
	        int result = 0;
	        int orig = number;
	        while(number != 0){
	            int remainder = number%10;
	            result = result + remainder*remainder*remainder;
	            number = number/10;
	        }
	        //number is Armstrong return true
	        if(orig == result){
	            return true;
	        }
	      
	        return false;
	    } 
}
