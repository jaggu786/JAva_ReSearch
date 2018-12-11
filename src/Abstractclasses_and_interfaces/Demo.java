package Abstractclasses_and_interfaces;

public abstract class Demo 

{
	
	abstract void calculate( double x);
	
	
	   

}
class Square extends Demo
{

	
	void calculate( double x) 
	{
		
		System.out.println(" the  square of "+x+" : "+(x*x));
		
		
		
	}
	
}

 class Cube extends Demo
 {

	
	void calculate(double x)
	{
		
		System.out.println(" the  cube of "+x+" : "+(x*x*x));
	}
	 

}