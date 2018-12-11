package thread;

import java.io.IOException;

public class Create_Thread 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		jagadeeshthread it=new jagadeeshthread();
		Thread t= new Thread(it);
		t.start();
		  System.in.read();
		  it.stop =true;
		     
		  
		 
		  
		  

	}

}  


class jagadeeshthread  extends  Thread 
{
	boolean stop= false;
	
	
	public void run()
	{
		
		
		for(int i=1;i<=10000;i++)
		{
			System.out.println(i);
			if(stop)
				return;
		}
	}
	
	
	
	
	
}