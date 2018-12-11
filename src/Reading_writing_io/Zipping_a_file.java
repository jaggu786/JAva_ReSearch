package Reading_writing_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class Zipping_a_file
{

	public static void main(String[] args) throws IOException 
	{

		
		FileInputStream fis =new FileInputStream("rakesh.doc");
	
		FileOutputStream fos = new FileOutputStream("file3");
		DeflaterOutputStream  dos =new DeflaterOutputStream(fos);
		int data ;
		while((data =fis.read())!=-1)
			dos.write(data);
		    fis.close();
		    dos.close();
		    
		    
		
		
		
		
	
		
	
		
		
		
		
		
		
		

	}

}
