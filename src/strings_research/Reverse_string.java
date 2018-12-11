package strings_research;

public class Reverse_string  extends Length_of_string  

{
	public static void main(String[] args) 
	{
	
		reverse_of_string("padmaja");
		
		
	}
	
	
	public static void  reverse_of_string( String s)
	
	{
		
		 
		  
	        // convert String to character array 
	        // by using toCharArray 
		
	int l=	Length_of_string.length_of_string(s);
	        char[] try1 = s.toCharArray(); 
	        
	        
	  
	        for (int i = l-1; i>=0; i--) 
	        {
	       System.out.print(try1[i]);
	        	
	        }
	            
	    } 
	
		
	
}

			
	
	
	



	
		
	
		
		
      


	
