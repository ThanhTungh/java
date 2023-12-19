
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 4, 7, 6, 0, 2, 1, 7};
		printArray(arr);
		int[] result = removeEven(arr);
		printArray(result);
	}
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int idx = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] % 2 !=0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
