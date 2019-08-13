package Freshers;

public class EvenOrOdd 
{

	public static void main(String[] args)
	
	{
		int n=56;
	String s=	evenOdd(n); 
	
	System.out.println(s);
		
	}
	public static String evenOdd(int n) {
		String s = "";

		if (n % 2 == 0) {
			s = n + " is an even number";
		} else {
			s = n + " is an odd number";
		}

		return s;

	}

}
