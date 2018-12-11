package thread;

public class Thread_singleTask {

	public static void main(String[] args) 
	{
		
	ThreadDemo td = new ThreadDemo();
	Thread t1= new Thread(td);
		
	t1.start(); 	

	}

}


class ThreadDemo implements Runnable
{
	
	
	public  void run() 
	{
		anymethod1();
		
		anymethod2();
		anymethod3();
		
		

	}

 void anymethod3() 
 {
		System.out.println(" definition of m3");
		
}
void anymethod2() 
{
	System.out.println(" definition of m2");
		
}

void anymethod1() 
{
		
	System.out.println(" definition of m1");
	}
}