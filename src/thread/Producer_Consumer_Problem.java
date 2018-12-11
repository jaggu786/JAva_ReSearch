package thread;

public class Producer_Consumer_Problem 
{

	public static void main(String[] args)
	{
		// producer object and consumer objects 

     Producer p = new Producer();
     Consumer c = new Consumer(p);
      
     // create 2 threads  and pass producer and consumer  objects
     Thread t1= new Thread(p);
     Thread t2= new Thread(c);
		
     t1.start();
     t2.start();
       
		
		

	}

}
