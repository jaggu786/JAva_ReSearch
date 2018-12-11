package strings_research;

public class Strings_are_always_immutable 
{

	public static void main(String[] args) 
	{
      
		
		String s1="data";
		
		
		String s2="base";
		s1=s1+s2;
		
		System.out.println(" jvm will create two separate objects   for  data and base ");
		System.out.println("  old object of s1  will  be removed  by garbage collector hence Strings are immutable ");
		
		System.out.println(s1);
		
		
		
		
		 
		

	}

}
 