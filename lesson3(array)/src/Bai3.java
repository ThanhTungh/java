import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {9, 5, 10, 10, 15, 9, 10};
		System.out.print("Enter number to search: ");
		int n = new Scanner(System.in).nextInt();
		int idx = 0;
		for(int i =0; i<arr.length; i++) {
			if(n == arr[i]) {
				idx = i;
				System.out.print("Found" );
				System.out.print(", at index: " + idx);
				
			}
		}
	
		System.out.print("Not found");
		
	}

}
