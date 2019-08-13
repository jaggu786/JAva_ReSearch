package Experienced;

public class StringBuilderReverse
{

	
	
	// Function to reverse a given string using StringBuilder
		public static String reverse(String str)
		{
			return new StringBuilder(str).reverse().toString();
		}

		public static void main(String[] args)
		{
			String str = "Levantek ";

			// Note that string is immutable in Java
			str = reverse(str);
			System.out.println("Reverse of the given string is : " + str);
		}
}
