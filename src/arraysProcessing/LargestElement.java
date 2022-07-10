package arraysProcessing;

import java.util.Arrays;

public class LargestElement {

	int largest;
	public static int largestElement(int[] arr) {
		Arrays.sort(arr);
		
		return(arr[arr.length-1]);
	}
	
	public int largestElementTraverse(int[] arr) {
		largest = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			
		}
		return(largest);
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,8,3,9,2,87,45,23};
		System.out.println(largestElement(arr));
		
		LargestElement l = new LargestElement();
		System.out.println(l.largestElementTraverse(arr));
	}

}
