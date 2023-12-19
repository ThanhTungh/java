import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = scanner.nextInt();
//
//        // Outer loop for rows
//        for (int i = 1; i <= n; i++) {
//            // Inner loop for spaces
//            for (int j = n - i; j > 0; j--) {
//                System.out.print("  ");
//            }
//
//            // Inner loop for ascending numbers
//            for (int k = i; k <= i; k++) {
//                System.out.print(k + " ");
//            }
//
//            // Inner loop for descending numbers (excluding the first row)
//            for (int k = i - 1; k >= 1; k++) {
//                System.out.print(k + " ");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        }
//
//        scanner.close();
		
		int n = 11;
		for(int row = 0; row<=n; row++) {
			//in n-row dau cach
			for(int i=0; i<n-row; i++) {
				System.out.print(" ");
			}
			for(int i=0; i <row; i++) {
				System.out.print(row%10+" ");
			}
			System.out.println();// line break
		}
	}

}
