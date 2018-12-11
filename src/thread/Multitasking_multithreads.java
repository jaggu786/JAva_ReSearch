package thread;

public class Multitasking_multithreads {

	public static void main(String[] args)
	{
	NewThread nt1= new NewThread(" cut the ticket ");
	NewThread nt2 = new NewThread(" show the seat ");
	
	
	Thread t1= new Thread(nt1);
	
	Thread t2= new Thread(nt2);
	
	t1.start();
	t2.start();
	
		
		
		
		
	}

}
