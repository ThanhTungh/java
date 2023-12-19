import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a function to reverse an array
		int[] originalArray = {1, 2, 3, 4, 5};
	    int[] reversedArray = reverse(originalArray);

	    System.out.println("Original Array: " + Arrays.toString(originalArray));
	    System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
	}

	private static int[] reverse(int[] arr) {
		// TODO Auto-generated method stub
		int n =arr.length;
		int[] brr = new int[n];
		for(int i = 0 ; i < n; i++) {	
			
			brr[i] += arr[n-1-i];
					
		}
		return brr; //gia tri tra ve
//
//		int[] arr = {1, 2, 3, 4, 5};
//		reverse(arr);
//		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}

//	private static void reverse(int[] arr) {
//		// TODO Auto-generated method stub
//		int n = arr.length;
//		for(int i = 0; i<n/2; i++) {
//			swap(arr, i , n-1-i);
//		}
//		
//	}
//
//	private static void swap(int[] arr, int i, int j) {
//		// TODO Auto-generated method stub
//		int temp = arr[i];
//		arr[i] = 
//	}
//luc nao la function, luc nao la operation, luc nao la method
}
