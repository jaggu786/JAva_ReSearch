package strings_research;

public class Stringconstantpool {

	public static void main(String[] args)
	{
		
		 String s1="jagadeesh";
		 
		 
		 String s2="jagadeesh";
		int n1= s1.hashCode();
		
	int n2=s2.hashCode();
	System.out.println(" the value of  s1 is :"+n1);
	System.out.println("the value of  s2 is :"+n2);
	
	
		if (s1==s2)  
		
		{
		
			System.out.println(" both strings are equal");
			
			System.out.println(" the value of  s1 is :"+n1);
			System.out.println("the value of  s2 is :"+n2);
			
		}
		
		else
		{
			System.out.println(" strings are not equal ");
		}
		
	}

}
