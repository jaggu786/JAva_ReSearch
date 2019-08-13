package Freshers;

public class FindDuplicates 
{
	
	
		public static void main(String[] args) 
		{
			
			getDuplicates("Padmaja");
			
			
		}
			 

		private static void getDuplicates(String string) 
		{
			
			  int cnt = 0;
			  char[] inp = string.toCharArray();
			  System.out.println("Duplicate Characters are:");
			  for (int i = 0; i < string.length(); i++) {
			   for (int j = i + 1; j < string.length(); j++) {
			    if (inp[i] == inp[j]) {
			     System.out.print(inp[j]);
			     cnt++;
			     break;
			    }
			   }
			  }
			 }
			
			
			
			
			
		}
			
			
			
		

		 


