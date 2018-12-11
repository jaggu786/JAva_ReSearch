package thread;

public class Producer implements Runnable 
{
StringBuffer sb;
	 Producer() 
	{
		sb = new StringBuffer();

    }
	
	public void run() 
	{
       synchronized(sb)
       {
    	   for(int i =1;i<=10;i++)
    	   {
    		   try
    		   {
    			   sb.append(i);
    			   
    			   Thread.sleep(100);
    			   
    			   System.out.println(" appending ");
    			   
    		   }
    		   catch(Exception e)
    		   {
    			   
    		   }
    	   }
    	   
    	   sb.notify();
    	   
       }
		
	}
}

