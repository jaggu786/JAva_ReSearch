package oops.polymorphism;



public class dyanamicpolymorphism
{

	public static void main(String[] args)
	{
		
		dyanamicpolymorphism dp= new dyanamicpolymorphism();
		dp.add(10,15);
		
		dp.add(10,15,18);
		
	}

	private void add(int i, int j, int k) 
	
	{
	System.out.println(" the three parametre addition :"+(i+j+k));
		
	}

	private void add(int i, int j)
	
	{
		System.out.println(" two parametre addition is    :"+(i+j));
		
		
		
		
	}

}
