package javaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2; i<=num; i++) {
			
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
	}

}
