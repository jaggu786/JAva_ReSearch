package datastructures;

import java.util.Scanner;

public class Linearsearch 
{

	public static void main(String[] args)    
	{
		
		System.out.println(" enter how many strings ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String  str[]=new String[n];
		System.out.println(" you entered "+n+"  digits ");
		for(int i=0;i<n;i++)
		{ 
			System.out.println(" please enter string at "+i+" index of String ARRAY : "); 
	        str[i]=sc.next(); 
		
		}
		System.out.println("enter the  string  to  be searched ");	  
    	String find_this_string =sc.next();	 
    
	    for(int k=0;k<n;k++)
	    {
	    	
	    	if(str[k].equalsIgnoreCase(find_this_string))
{
	   
	  System.out.println(" your  search word found at  index "+k+"  of String Array");
	          
	             
}
	   
	    }   
	
	      
				  
	      

	}

}

