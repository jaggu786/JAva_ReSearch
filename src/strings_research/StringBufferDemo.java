package strings_research;

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		
		//------------------StringBuffer--------------
		StringBuffer sb =new StringBuffer();
		
		// the default capacity of stringBuffer 
		  int d=sb.capacity();
		  System.out.println(d);
	// length of Stringbuffer 	
	       int n=	sb.length();
	
	
	System.out.println(n);
	
	
		//-------------------------------------
	
	// ------methods of String Buffer------
	
	// append 

	sb.append(" jagadeesh kumar balaga ");
	System.out.println(sb);
	
		// reverse 
	System.out.println(sb.reverse());
	
	System.out.println(sb.toString());
		
		  System.out.println(sb.length());
		
	  System.out.println(sb.insert(7, " hhi "));
	   System.out.println(sb.substring(5, 9));
		  
		  

	}

}
