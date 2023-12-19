import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given two arrays 'arr' & 'brr' of length n & m respectively
		Generate values randomly for 'arr' & 'brr'
		Then copy content of 'arr' to 'brr'
		For examples:
		arr[] = {5,9,2,0}
		brr[] = {3,10,4,5,6}
		 Out put brr[] = {5,9,10,..}*/
		int n = 5;
		int m = 7;
		int arr[] = new int[n];
		int brr[] = new int[m];
		
		Random random = new Random();
		System.out.print("arr[]= ");
		for(int i=0; i<n; i++) {
			arr[i] = random.nextInt(21);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("brr[]= ");
		for(int i=0; i<m; i++) {
			brr[i] = random.nextInt(21);
			System.out.print(brr[i] + " ");
		}
//		brr = arr;
		int k = ( n > m ) ? m : n;
		for(int i=0; i<k; i++) {
			brr[i] = arr[i];
		}
		
		brr = Arrays.copyOf(arr, arr.length);
			
		System.out.println();
		System.out.print("brr[]= ");
		for(int i=0; i<brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}

}
