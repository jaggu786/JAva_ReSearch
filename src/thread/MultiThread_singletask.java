package thread;



public class MultiThread_singletask
{

	public static void main(String[] args) 
	{
		
		 
		
		Reservation r = new Reservation(1);
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		
		t1.setName(" jagadeesh");
		t2.setName(" padmaja");
	
	 
		t1.start();
		t2.start();
		
		int n=	t1.getPriority();
		
		System.out.println(n);
	int n3=	t2.getPriority();
		
		System.out.println(n3);
		 
			 
		
		
		
		

	}

}
 class Reservation implements   Runnable
 
 {
	 int avail=1;
	 int wanted;
	public Reservation(int i) 
	{
	
		this.wanted = i;
	}
	
	public void run()
	{
		synchronized(this )
		{
		  System.out.println(" availabale berths "+avail);
             if(avail>=wanted)
			{
				String name =Thread.currentThread().getName();
				
				System.out.println(wanted +" seat is alloted to current object: "+name);
			
			try 
			{
				
				Thread.sleep(5000);
				avail= avail-wanted;
			
			}
		    catch(InterruptedException e)
			{
				
			}
			}
             else
             {
            	 
		
		System.out.println(" sorry no berth ");
		
             }
             
		}	
				
				
			
			
			}
			
		
		
		
		
	}
	 
	 
	 
	 
	 
 