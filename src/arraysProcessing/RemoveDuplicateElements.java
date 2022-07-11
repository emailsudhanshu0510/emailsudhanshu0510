package arraysProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	//Using HashSet
	public static void removeDuplicate(int[] arr) {
		Set list = new HashSet();
		for(int i = 0; i < arr.length; i++) {
			
			if(list.add(arr[i])==false) {
				System.out.println("Duplicate Numer is " + arr[i]);
			}
			
		}
		System.out.println(list.size());
		Object[] newArr = list.toArray();
		
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 5, 2, 2, 5, 8, 9, 12, 3, 4, 3};
		
		//removeDuplicate(arr);
		
		int[] newArr = new int[arr.length];
	
			
			
		}
		
		

	}


