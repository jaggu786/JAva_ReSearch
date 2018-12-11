package oops;

public class Staticdemo {

	public static void main(String[] args) 
	{
		
		
		StaticBehaviour  sb1= new StaticBehaviour();
		++sb1.x;
		System.out.println(" the value of x is" );
		sb1.display();
		StaticBehaviour sb2= new StaticBehaviour();
		sb2.display();
		
		System.out.println("any operation done on one object ");
		
		System.out.println(" other objects also  changes ");

	}

}
