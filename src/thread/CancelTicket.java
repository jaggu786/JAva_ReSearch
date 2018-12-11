package thread;

public class CancelTicket implements Runnable 
{
	
	

	Object train;
	 Object compartment;

	public CancelTicket(Object train, Object compartment)
	{
		this.train= train;
		this.compartment=compartment;
	}
   public void run()
   
{
	   synchronized (train)
		{
			
			System.out.println(" Cancel Ticket locked on train ");
			
			
			synchronized(compartment)
			{
				System.out.println(" cancel ticket locked on compartment ");
				try
				{
					Thread.sleep(1500);
					
				}
				catch(InterruptedException e)
				{
					System.out.println(" cancel ticket  now waiting  to lock on train");
				}
			
		}
	   
	   
	


		}
	}
	
}


	
	
	
	
