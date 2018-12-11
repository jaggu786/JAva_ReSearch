package research_java;

import java.awt.List;
import java.util.Scanner;

public class Fibonnaccci_generator {

	public static void main(String[] args) {
		for (int j = 0; j <= 8; j++) {
			int n = Fibonaccigenerator(j);

			System.out.print(n + ",");

		}

	}

	static int Fibonaccigenerator(int n)

	{
		if (n <= 1)
			return n;

		else {
			return (Fibonaccigenerator(n - 1) + Fibonaccigenerator(n - 2));

		}

	}

}
