package Abstractclasses_and_interfaces;

public class Generate_ElectricityBill
{

	public static void main(String[] args) 
	{
		
		ElectricityBill eb = new Domestic();
		eb.getrate();
		System.out.println(" domestic current bill for 100 units ");
		eb.calculatebill(100);
		
		System.out.println(" Industrial current bill for 300 units");
		eb = new Industrial();
		eb.getrate();
		eb.calculatebill(300);
		
		
		
		
	} 

}
