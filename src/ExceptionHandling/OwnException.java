package ExceptionHandling;

import java.io.InputStream;
import java.util.Scanner;

public class OwnException extends Exception
{
	

OwnException(String string)
{
	
	super(string);


	}

public OwnException()
{
	
	
}

	


	

public static void main(String[] args)
{
	

	System.out.println(" Enter  your age ");
	Scanner sc =new Scanner(System.in);
	int age=sc.nextInt();
	try
	{
	if(age<18)
	{

	
		OwnException nve= new OwnException("valid 18 above only");
	
		throw nve;
	}
	}
	 catch (OwnException nve) {
		// TODO Auto-generated catch block
		nve.printStackTrace();
		
	}
	
	
	}
	
	
	
}
