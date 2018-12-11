 package research_java;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int max =sc.nextInt();
		
		System.out.println(" you entered Maximum  value "+max );
		
		Random r= new Random();
		for(int i=1;i<=10;i++)
		{
			System.out.println(r.nextInt(max));
			
		}

	}

}
