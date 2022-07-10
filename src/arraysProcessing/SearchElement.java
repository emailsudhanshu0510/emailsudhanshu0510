package arraysProcessing;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr = {1,8,3,9,2,87,45,23};
	System.out.println("Enter the number to be searched ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Boolean b = false;
	
	for(Integer i: arr) {
		if(num==i) {
			b = true;
			System.out.println(num + " is present in the array");
			break;
		}
		
	}
	if(b==false) {
		System.out.println(num + " not found");
	}

	}

}
