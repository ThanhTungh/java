import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given an integer calculate pow(A*, 2) where A* is formed by digits of A in reverse order
		Scanner scanner = new Scanner(System.in);
		
		System.out.println( "number of x = ");
		int number = scanner.nextInt();	
		scanner.close();
		
		int reverseNumber = reverse(number);
		System.out.println(reverseNumber + "^" + 2 + "=" + reverseNumber * reverse(number));
		
	}

	public static int reverse(int number) {
		int reverse = 0;
		  while(number != 0) {
		      int digit = number % 10;
		      reverse = reverse * 10 + digit;
		      number /= 10;
		    }

		    System.out.println("Reversed Number: " + reverse);
			return reverse;
		  }
}
