package Experienced;

import java.util.Scanner;

public class FloydTriangle 
{
	
		private static Scanner sc;
		
		public static void main(String[] args) {
			int  rows, i,  j, number = 1;
			sc = new Scanner(System.in);		
			System.out.println(" Please Enter the Number of Rows you wish to see in FloydTriangle:  ");
			rows = sc.nextInt();
			System.out.println("---- Printing FLOYD'S Triangle ------");
			for ( i = 1 ; i <= rows; i++ ){
				for ( j = 1 ; j <= i; j++ ) {
					System.out.format("%d ", number);
					number++;
				}
				System.out.println("");
			}
		}
	}
	
	


