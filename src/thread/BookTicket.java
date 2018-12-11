package thread;

public class BookTicket  extends Thread 
{

	Object train;
    Object compartment;

	public BookTicket(Object train, Object compartment)
	
	{
		this.train=train;
		this.compartment =compartment;
	}
public void run()
{
	synchronized(train)

	{
		
		
		System.out.println(" Book Ticket locked Train");
		
		try
		{
			Thread.sleep(150);
	
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Book ticket now waiting to lock  on compartment ... ");
		  synchronized(compartment)
		  {
			  
			System.out.println(" Book Ticket Locked on Compartment ");  
			  
			  
		  }
	}
	
	
	
}
	
	
	
	
}
