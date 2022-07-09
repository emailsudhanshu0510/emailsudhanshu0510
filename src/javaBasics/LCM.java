package javaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = sc.nextInt();	
		int num2 = sc.nextInt();
		
		int product = num1*num2;
		int gcd = 0;
		int i = 1;
		for(; i<=num1; i++) {
			
			if(num1%i==0) {
				if(num2%i==0) {
					gcd = i;
				}
				
			}
			
		}
		int lcm;
		lcm = product/gcd;
		System.out.println("LCM of " + num1 +  " and " + num2 + " is " + lcm );

		
		
		
		

	}

}
