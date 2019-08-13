package Experienced;

public class CommonElementsbetweenArrays
{
	public static void main(String[] args)
	
	{
		
		   int[] arr1 = {12,23,34,45,76};
	       int[] arr2 = {23,34,78,76,43};
	       System.out.println(" the common elements are : ");
	     
	     getCommonElements(arr1,arr2);
	     
		
	}

	private static void getCommonElements(int[] arr1, int[] arr2)
	{
		
		
		
		
		for (int i=0;i<arr1.length;i++)
            {
	         for(int j=0;j<arr2.length;j++){
	             if(arr1[i]==arr2[j])
	             {
	            	 
	            	 
	                 System.out.println(arr1[i]);
	             }
	             
	            
	            
	         }
	     }
	 }
	}
	
     
     
   

