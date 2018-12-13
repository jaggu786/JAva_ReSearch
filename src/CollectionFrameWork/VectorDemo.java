package CollectionFrameWork;
import java.util.*;
public class VectorDemo 
{
	
	public static void main(String[] args)
	{
Vector<Integer> v = new Vector<Integer>();
v.add(50);
v.add(70);
v.add(80);
v.add(90);
v.add(100);
v.add(11);
v.add(12);
System.out.println(v.firstElement());
System.out.println(v);
System.out.println(v.capacity());

ListIterator<Integer> li =v.listIterator();

System.out.println(" ......forward......");
while(li.hasNext())	
{
	System.out.println(li.next());
	
}

System.out.println(" ...backward..........");
while(li.hasPrevious())
{
	System.out.println(li.previous());
}
		
		
		
		
	}
	
	
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


