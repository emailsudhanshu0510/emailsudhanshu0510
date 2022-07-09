package javaBasics;

import java.util.Scanner;

public class ArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1 = sc.nextInt();	
		int n2 = sc.nextInt();
		
		for(int i = n1; i<=n2; i++)
		{
			int num = i, sum = 0, rem = 0;
			while(num!=0) {
				
				rem = num%10;
				sum = sum + rem*rem*rem;
				num/=10;	
			}
			if(sum==i) {
				System.out.println(i + " is armstrong");
			}
			
		}
		
		
	


}
}
