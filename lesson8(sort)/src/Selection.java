import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,2,3,5,4,6};
		int n = arr.length;
		for(int i =0; i< n-1; i++) {
			int idx = findMin(arr, i);
			swap(arr, i, idx);
		}
		System.out.print(Arrays.toString(arr));
	}

	private static int swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
		return temp;
	}

	private static int findMin(int[] arr, int i) {
		// TODO Auto-generated method stub
		int min = i;
		for(int j= i+1; j < arr.length; j++) {
			if(arr[j] < arr[min])
				min = j;
		}
		return min;
	}
	// so phep so sanh can thuc hien trong selection sort la: n* (n-1)/2
	//time complexity la : O(n^2)	

}
