package Reading_writing_io;

import java.io.FileInputStream;

import java.io.IOException;

public class Reading_a_file
{

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream read= new FileInputStream("my file.txt");
		
	int ch;
	 while((ch=read.read())!=-1)
		 System.out.print((char) ch);
	 
	 read.close();
	 
		
		  
				
		
		
		

	}

}
