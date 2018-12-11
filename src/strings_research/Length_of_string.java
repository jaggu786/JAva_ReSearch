package strings_research;



public class Length_of_string 
{
	   
	public static String s;
	public static char[] sf;

	public static  int length_of_string(String s)
	{

	 char[]  sf=s.toCharArray();
	int i=0; 
	try
	{
	while(sf[i]!='\u0000')
	{
		i=i+1;
		
		
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
	}
	return i;
	
	}
}
	
	


