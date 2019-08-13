package Experienced;

import java.util.Arrays;

public class AnaGramsOrNot
{

	public static void main(String[] args)
	
	{
		
	boolean b=	areAnagram("listen","silent"); 
	
	if(b==true)
	{
		System.out.println(" the strings are anagrams of each Other ");
	}
	else
	{
		System.out.println(" the strings are not anagrams ");
	}
		
	}
	
	static boolean areAnagram(String s1, String  s2) 
    { 
        // Get lenghts of both strings 
		char[] str1= s1.toCharArray();
		char[] str2= s1.toCharArray();
		
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
}
