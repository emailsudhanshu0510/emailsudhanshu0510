package arraysProcessing;

public class CheckEqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 3, 2, 6, 7}, arr2 = {1, 3, 2, 6, 7};
		int count = 0;
		
		if(arr1.length!=arr2.length) {
			System.out.println("Arrays are not equal");
		}
		else {
			for(int i = 0; i< arr1.length; i++) {
				if(arr1[i] == arr2[i]) {
					count++;
				}
			
			}
			if(count==arr1.length) {
				System.out.println("Arrays equal");
			}
			else {
				System.out.println("not equal");
			}
		}


	}

}
