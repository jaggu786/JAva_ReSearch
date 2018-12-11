package Reading_writing_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Employee_serializable
{

	public static void main(String[] args) throws IOException 
	{


		// Object output stream
		// writeObject Method are useful in creating Serializable 
	FileOutputStream fos= new FileOutputStream("jahahah.txt");
	
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	Scanner sc = new Scanner(System.in);
	System.out.println(" How many objects ");
	int n= sc.nextInt();
	for(int i=0;i<n;i++)
	{
		Employee e1= Employee.getdata();
		
		oos.writeObject(e1);
	}
	
		
		
		
	oos.close();	
		
		
		
		
	}

}
