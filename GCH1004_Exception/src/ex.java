import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int d;
		do {
			System.out.print("Enter d = ");
			try {
				d = scanner.nextInt();
			d = scanner.nextInt();
			if (d==0)
				System.err.println("d should not be 0");
			}catch(Exception ex) {
				scanner.nextLine();
				System.out.println("d should be 0");
			}
		}while (d==0);
		int x = 18/d;
		System.out.println("x = " + x);
	}

}