package oops.objects;

import java.util.Scanner;

public class InnerClass 
{

public static void main(String[] args)
{
  
	
	BankAccount  ba= new BankAccount(1000);
	//update balance at the rate of intrest at 9.5%
	ba.key_to_Intrest(9.5);		
}

} 

  
  class BankAccount
  {
	  private double bal;
 public BankAccount(double b) 
 {	
		this.bal = b;
 }
// Inner class can be Used Through this method 
void   key_to_Intrest(double r)
{
	 System.out.println(" enter password to use Intrest method ");
	Scanner sc= new Scanner(System.in);
	String password =sc.next();
	if(password.equals("padmaja"))
	{
		
		Intrest_hidden in = new Intrest_hidden(r);
		in.calculateIntrest();
	}
	else
	{
		System.out.println(" sorry this method is hidden ");
		
	}
	
	
}
// this Entire class is Hidden From Others 
// only Authorized person   can use this class 
private  class Intrest_hidden
   {
	
	private double rate;
	 Intrest_hidden(double r )
	{
		rate=r;
	}
	 void calculateIntrest()
	 {
		 double  i =bal*rate/100;
		 bal= bal+i;
		 System.out.println(" updated balance "+bal);
		 
		 
	 }
	   
   }
  }