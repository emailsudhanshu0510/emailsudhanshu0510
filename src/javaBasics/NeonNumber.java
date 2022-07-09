package javaBasics;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		int num1 = num;
		while(num!=0) {
			sum  = sum + num%10;
			num/=10;
		}
		
		if(sum*sum == num1) {
			System.out.println(num1 + " is a Neon number");
		}
		else {
			System.out.println(num1 + " is not a Neon number");
		}

	}

}
