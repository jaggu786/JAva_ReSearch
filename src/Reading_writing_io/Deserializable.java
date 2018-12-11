package Reading_writing_io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable
{

public static void main(String[] args) throws IOException, Exception 
	
{
	
FileInputStream fis = new FileInputStream("emp.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
Employee e;
while((e=(Employee)ois.readObject())!=null)
{
	
	e.display();
}
ois.close();


		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
