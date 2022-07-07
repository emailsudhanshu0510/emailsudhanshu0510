package javaBasics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter upto which number prime numbers are to be printed? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int num = 2; num<=n; num++) {
			int count = 0;

			for(int i = 1; i <= num ; i++)
			{
				if(num%i == 0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.out.println(num + " is a prime number");
			}
			
		}

	}

}
