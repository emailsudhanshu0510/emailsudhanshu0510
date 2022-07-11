package arraysProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 9, 2, 5, 1, 8, 1};
		int key = 1;
		
		List list = new ArrayList();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=key) {
				list.add(arr[i]);
			}
		}
		
		Object[] newArray = list.toArray();
		System.out.println(Arrays.toString(newArray));
		
		
	}

}
