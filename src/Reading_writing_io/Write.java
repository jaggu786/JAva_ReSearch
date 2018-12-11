package Reading_writing_io;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Write
{

public static void main(String[] args) throws IOException
{
	
	DataInputStream keyboard =new DataInputStream(System.in);
	FileOutputStream  fout = new FileOutputStream("jagadeesh.txt",true);
 
	System.out.println(" enter text  : end of file =@");
	char ch;
	while((ch=(char) keyboard.read())!='@')
		fout.write(ch);
	
	fout.close();
	
	
}
	
	 
	
	
	
	
	
	
}

