package Reading_writing_io;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Filecreate 
{

	public static void main(String[] args) throws IOException 
	{

DataInputStream  dis= new DataInputStream(System.in);
FileOutputStream  fout= new FileOutputStream("padmaja",true );
BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
char ch ;
while((ch=(char)dis.read())!='#')
	
	bout.write(ch);
    bout.close();




		
		
		
		
		
		
		
		
		
		

	}

}
