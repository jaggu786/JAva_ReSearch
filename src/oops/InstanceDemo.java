package oops;



	

	class InstanceDemo
	{
		

	public static void main(String[] args)
	{
		_Instance_behavaiour ins1= new _Instance_behavaiour();
		
				
		_Instance_behavaiour ins2= new _Instance_behavaiour();
		
	++ins1.x;
	System.out.println(" the value of x in ins1 ");
	ins1.display();
	System.out.println(" the value of x in  ins2  ");
	ins2.display();
	
	System.out.println("the value of instance variable is  10 ");
	
	System.out.println("increment operation  performed  only on ins1 ");
	
	 

	}


}
