package Set_Concept_collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
   /**
 * @param args
 */
public static void main(String[] args) 
 {
	HashSet<String> hs = new HashSet<String>(3,(float) 0.5);
HashSet<Integer> hs1 = new HashSet<Integer>();
	hs.add("India");
	hs.add("japan");
	hs.add("china");
	hs.add("england");
	hs.add("England");

	int n=hs.size();
	
	System.out.println(hs+"     "+n);
	
Iterator it = hs.iterator();

while(it.hasNext())
{
	  String s=(String) it.next();
	  System.out.println(s);
}

	   
	
	
	
	
}


	
}


	


	


