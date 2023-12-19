import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
        int A = new Scanner(System.in).nextInt();
        System.out.print("Enter Pow: ");
        int pow = new Scanner(System.in).nextInt();
        int reversedA = 0;
        while (A != 0) {
            int digit = A % 10;
            reversedA = reversedA * 10 + digit;
            A /= 10;
        }
        int result = 1;
        for (int i = 1; i<=pow;i++) {
        	result *= reversedA ;
        }
        System.out.print(reversedA+"\n");
        System.out.print(result);
	}

}
