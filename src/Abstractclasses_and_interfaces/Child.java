package Abstractclasses_and_interfaces;

public class Child  implements Father, MotherInterface
{

	
	public void hieght()
	{
		float hieght=((Father.hieght + MotherInterface.hieght))/2;
		System.out.println(" child hieght "+hieght );
		


	
	
	
	 
	}
}

