package lesson1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("Enter a number 1: ");
//		int num1 = new Scanner(System.in).nextInt();
//		System.out.printf("Enter a number 2: ");
//		int num2 = new Scanner(System.in).nextInt();
//		System.out.printf("Enter a number 3: ");
//		int num3 = new Scanner(System.in).nextInt();
//		int max = num1;
//		if (max < num2) {
//			max = num2;
//		}
//		if(max < num3) {
//			max = num3;
//		}
//		System.out.print(max);
		//////////////////////////////////////////
		//cach 2
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers to be input: ");
		int n = sc.nextInt();
		System.out.println("Enter value: ");
		int max = 0;
		for(int i = 0; i<n; i++) {
			int temp = sc.nextInt();
			if(i == 0) {
				max = temp;
			}else
			{
				if(max < temp)
					max = temp;
			}
		}
		System.out.print(max);
		
		
//		System.out.printf("Enter nums of number: ");
//		int num = new Scanner(System.in).nextInt();
//		
//		int max = Integer.MIN_VALUE;
//		for(int i = 1; i <= num ; i++) {
//			System.out.printf("Enter number " + i +":");
//			int input = new Scanner(System.in).nextInt();
//
//            if (input > max) {
//                max = input; // Update max if the input is greater
//            }
//		}
//		System.out.println("The maximum number is: " + max);
	}

}
