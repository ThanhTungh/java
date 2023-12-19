import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 4, 7, 6, 0, 2, 1, 7};
		int n = 0;
		//keep odd numbers
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 !=0)
				arr[n++] = arr[i];
		}
		//Optional
		arr=Arrays.copyOf(arr,  n);
		//Output
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
