package arraysProcessing;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 8, 1, 9, 12, 52, 19};
		
		int[] arr2 = { 6, 1, 8, 2};
		
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for(int i = 0; i<arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}
		int n = arr1.length;
		
		for(int i = 0; i<arr2.length; i++) {
			arr3[n++] = arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
