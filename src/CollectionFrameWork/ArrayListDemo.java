package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
  public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		
		// add objects
		al.add("london");
		al.add("paris");
		al.add("newyork");
		al.add("australia");
		System.out.println(al);
		
		
		// remove objects
	  
	  al.remove("newyork");
	  al.remove(2);
	  
	  System.out.println(al);
	  al.set(0,"newdelhi");
	  System.out.println(al);
	System.out.println(al.get(0));
	   System.out.println(al.lastIndexOf("newdelhi"));
	   System.out.println(al.size());
	   
	   Iterator<String> i=al.iterator();
	   
	  while(i.hasNext())
		
	  {
		  System.out.println(i.next());
	  }
	}
	
	
	
	
	
	
	
	
	
}
