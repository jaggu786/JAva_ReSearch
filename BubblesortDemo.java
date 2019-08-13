package Experienced;

public class BubblesortDemo 
{
	
	public static void main(String[] args) 
	{
		int arr[]= { 12,23,34,45,56,76};
		 getSortBy_BubbleSort(arr);
		 
		
	}

	private static void getSortBy_BubbleSort(int[] arr) 
	
	{
		
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	        
	        printArray(arr);
	    }
	
	 private static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
		
	}
	 


