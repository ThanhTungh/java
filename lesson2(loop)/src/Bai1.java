import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number A: ");
		int A = new Scanner(System.in).nextInt();
		System.out.print("Enter number B: ");
		int B = new Scanner(System.in).nextInt();
		int count = 0;
		int sum = 0;
		
		/////////////////////////cach2
		int start = (A%2==0) ? A: (A+1);
		for(int i= start; i<=B; i++) {
			sum +=i;
			count++;
		}
//		for (int i=A; i<=B; i++) {
//			if(i % 2 == 0) {
//				sum +=i;
//				count++;			
//			}
//		}
		System.out.print(sum +"\n");
		System.out.println(count);

	}

}
