package Abstractclasses_and_interfaces;

public abstract class ElectricityBill 

{ 
	
	
	protected  double rate;

	abstract   void getrate();
	
	public void calculatebill(int  units )
	{
		
		System.out.println( rate*units );
		
		
		
		
	}
}
  
class Domestic  extends ElectricityBill
{

	
	void getrate() 
	{
		
		rate=5.80;
		
	}
	
	
	
}


class Industrial extends ElectricityBill
{

	
	void getrate() 
	{
		rate=9.8;
		
	}
	
}