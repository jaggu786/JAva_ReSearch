package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args)
	{
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("America");
		ll.add("Africa");
		ll.add("Australia");
		ll.add("Antartica");
		
		ll.add(0, "andhra");
		ll.addFirst("first");
		ll.addLast("last");
		System.out.println(ll.indexOf("Australia"));
		
		int n=ll.size();
		ll.add(3, "kenya");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.lastIndexOf(ll));
		System.out.println(ll.peek());
		
		
		
		
		System.out.println(ll.remove(ll));
		
		
	}
	
	

}
