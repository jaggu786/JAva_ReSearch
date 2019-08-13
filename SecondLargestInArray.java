package Freshers;

public class SecondLargestInArray
{
	
	
	public static void main(String[] args) 
	{
		
		int array[]= {12,23,34,45,98,88};
		
		System.out.println("The second Highest Of a Number ");
		
		int  secondhighest=findSecondLargestNumberInTheArray( array);
		
		System.out.println(secondhighest);
		
	}
	public static int findSecondLargestNumberInTheArray(int array[])
	{
		// Initialize these to the smallest value possible
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
 
		// Loop over the array
		for (int i = 0; i < array.length; i++) {
 
			// If current element is greater than highest
			if (array[i] > highest) {
 
				// assign second highest element to highest element 
				secondHighest = highest;
 
				// highest element to current element
				highest = array[i];
			} else if (array[i] > secondHighest)
				// Just replace the second highest
				secondHighest = array[i];
		}
 
 
		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		return secondHighest;
	}
	
	
	
}
