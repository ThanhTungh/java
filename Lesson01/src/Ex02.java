import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int a , b , k;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a = ");
		a = scanner.nextInt();
		System.out.print("Enter b = ");
		b = scanner.nextInt();
		System.out.print("Enter k = ");
		k = scanner.nextInt();
		
		//process
		for(int i=a; i<=b; i++) {
			if(i % k == 0);
			count++;
		}
		
		count = 0;
		
		//cach 2
		int a_new = (a%k==0) ? a: (a/k + 1) *k;
		for(int i=a_new; i<=b; i+=k) {
			count++;
		}
		
		count = 0;
		//cach 3
		a_new = (a%k==0) ? a:(a/k +1) *k;
		count = b/k- a_new/k + 1;
		
		
		//Output
		System.out.println("COunt = " + count);
		
	}
}