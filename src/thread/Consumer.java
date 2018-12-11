package thread;

public class Consumer implements Runnable
{

	Producer prod;
	Consumer(Producer prod)
	{
		this.prod=prod;	
	}
	public void run() 
	{

         synchronized(prod.sb)
            {
	          try
	          {
	        	  
	        	prod.sb.wait();  
	        	  
	          }
        	 catch(Exception e)
	          {
        		 
	          }
        	 System.out.println(prod.sb);
        	 
            }
		
	}

}
