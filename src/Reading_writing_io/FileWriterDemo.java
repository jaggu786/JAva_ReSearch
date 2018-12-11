package Reading_writing_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{

	public static void main(String[] args) throws IOException 
	{

String str= "this is book  "; 
FileWriter  fw= new FileWriter("text");

for(int i=0;i<str.length();i++)
{
	fw.write(str.charAt(i));
	
}

fw.close();		
		
		
		
		
		
		
		
		
		
		
	}

}
