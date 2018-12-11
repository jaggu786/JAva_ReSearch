package oops.objects;

public class A 
{
	// instance variable of A 
	int x;
	
	// Reference Variable of B 
	B b;

	public A(B b)
	
	{
		
		this.b = b;
		
		x=10;
		  
	}
	  void display()
	  {
		   System.out.println("  the value of x in A is "+x );
		   
		   
		   b.display();
		   
		   
		   System.out.println(" the value of y in   B is  "+b.y);
		   
	  }
	
	
	
	
	
	
	
	
	

}


