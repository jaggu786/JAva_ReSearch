package strings_research;

public class StringMethod_demonstrator 
{

	public static void main(String[] args)
	{
    // #way1 of creating string
		String s1="jagadeesh kumar ";
		 // #way 2of creating string
		char[] role= {'b','a','l','g','a'};
		String s2=new String(role);
		
		 // #way3 of creating string starting index, no of charcaters 
		String s3=new String(role,1,3);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		System.out.println("s1 length  "+s1.length());
		System.out.println("s1 in upper case"+s1.toUpperCase());
		System.out.println(" the unicodevalue of charcater in that index "+s1.codePointAt(4));
		
		System.out.println((s1.length())-s2.length()); 

		
    compareuniocode("sri rama");

    System.out.println(s1.compareTo(s2));

		
		
	}
	
	
	public static void compareuniocode(String s) 
	{
		int n=s.length();
		for(int i=0;i<n;i++) 
		{
			int g
			= s.codePointAt(i);
			System.out.println(g);
			
		}
	
		
		
		  
		


	}

	

		
		
		
		
		 
		
		
		
		
		
		
	
		
		
		
		
	}


