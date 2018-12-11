package thread;

public class NewThread implements Runnable {

	String string;

	NewThread(String string) 
	 {
		this.string=string;
	}

	
	public void run() 
	{
		
		
		
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(string+"  "+i);
			try {
				Thread.sleep(2000);
				
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
	}
	
				
			
			
		
	

	
	
	
}
