package searchArray;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,9,13,19,24,67,90};
		
		int l = 0, h = arr.length-1;
		
		int m = (l+h)/2;
		
		System.out.println("Enter number to be searched");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Boolean b = false;
		
		while(l!=h)
		{
			if(n == arr[m]) {
				b = true;
				System.out.println(n + " is found at " + (m+1) + " position");	
				break;
			}
			else if(n > arr[m]){
				l = m+1;			
			}
			else {
				l = m-1;
			}
			m = (l+h)/2;
		}
		if(b == false) {
			System.out.println("number not found");
		}
		
	}

}
