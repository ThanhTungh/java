

public class Ex02 {

	public static void main(String[] args, Object function) {
		// TODO Auto-generated method stub
		//1. Given an array. find maximum value and its index using function
		//2. Suppose after 1 , you have to function named findMax()
		//, how to reuse it in order to solve the excercise finding k_th maximum
		int arr[] = {0, 21, 22, 7};
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println("Maximum value is: " +arr[idx] + " , at position " +idx);
	}
}
