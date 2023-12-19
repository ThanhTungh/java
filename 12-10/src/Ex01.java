import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 12, 7, 15, 8, 2};
		int brr[] = sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
	}	
	private static int[] sort(int[] arr) {
		int brr[] = Arrays.copyOf(arr, arr.length);
		int count = 0;
		//Insertion sort
		for(int i=1; i<brr.length; i++) {
			int key = brr[i];
			int j;
            for (j = i - 1; j >= 0 && key < brr[j]; j--) {
                count++;
                brr[j + 1] = brr[j];
            }
//			int j = i-1;
//			while(j>=0 && key<brr[j]) {
//				count++;
//				brr[j+1] = brr[j];
//				j--;
//			}
			brr[j+1] = key;	
		}
		System.out.println("Count = " + count);
		return brr;
	}
}
