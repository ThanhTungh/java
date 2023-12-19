import java.util.Scanner;

public class Exception {
	public static void main(String args[]) {
//		int d = new Scanner(System.in).nextInt();
//		int x = 0;
//		if(d !=0) {
//			x = 10/d;
//			System.out.println("x = " + x);
//		}else {
//			System.err.println("d should not be 0");
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		int d;
//		do {
//			System.out.print("Enter d = ");
//			try {
//				d = scanner.nextInt();
//			d = scanner.nextInt();
//			if (d==0)
//				System.err.println("d should not be 0");
//			}catch(Exception ex) {
//				scanner.nextLine();
//				System.out.println("d should be 0");
//			}
//		}while (d==0);
//		int x = 18/d;
//		System.out.println("x = " + x);
			
		
		Scanner scanner = new Scanner(System.in);
		int d, x;
		boolean flag = true;
		do {
			try {
				System.out.print("Enter d = ");
				d = scanner.nextInt();
				x = 18/d;
				System.out.println("x = " + x);
				flag = true;
			}catch(InputMismatchException el) {
				scanner.nextLine();
				System.out.println("d must be a number");
				flag = false;
			}catch
		}
	}

}
