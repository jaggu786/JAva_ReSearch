package Abstractclasses_and_interfaces;

public class RunInterface 
{

	public static void main(String[] args)
	{
		
		ConnectAnyDatabase cad = new Oracledatabase();
		cad.connect();
		cad.disconnect();
		cad = new SqlServerConnect();
		cad.connect();
		cad.disconnect();
		
				
		

	}

}
