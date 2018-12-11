package Reading_writing_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;



public class Unzipping 
{
	

	public static void main(String[] args) throws IOException 
	{

// This Statement  Reads data from given file 
		FileInputStream  fis= new FileInputStream("file3");
// this statement writes data into given file 
		FileOutputStream fos= new FileOutputStream("unzip");
		InflaterInputStream iis = new InflaterInputStream(fis);
		int data;
		while((data=fis.read())!=-1)
			fos.write(data);
		
		fos.close();
		iis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
