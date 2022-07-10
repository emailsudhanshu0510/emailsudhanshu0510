package arraysProcessing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {65, 9, 3, 78, 90, 34, 19};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		
		for(int i = 0; i < arr.length/2; i++) {
			
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
