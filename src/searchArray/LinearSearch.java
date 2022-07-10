package searchArray;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 8, 2, 7, 36, 5, 9, 1 };

		Boolean b = false;

		System.out.println("Enter number to be searched");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == n) {
				b = true;
				System.out.println(arr[i] + " is found at " + i + "position");
			}

		}
		
		if(b==false) {
			
			System.out.println("number not found");
		}

	}

}
