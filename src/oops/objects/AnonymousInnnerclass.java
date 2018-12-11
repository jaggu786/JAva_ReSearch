package oops.objects;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnnerclass extends Frame
{
	public static void main(String[] args) 
	
	{
		
		AnonymousInnnerclass   obj = new AnonymousInnnerclass();
		
		obj.setSize(400,300);
		obj.setVisible(true);
		
	}
	
	 AnonymousInnnerclass()
	
	{
		
		// Create push button
		  Button b= new Button(" ok ");
			add(b);
			
			// Entire  class  code is given   as paramater 
			
			// this concept is known as Anonymous Inner class 
			b.addActionListener(new ActionListener()
					{
					         public void actionPerformed(ActionEvent ae)
					         {
				                 System.exit(0);
				
					         }
					});
			
			


	}
}
 





