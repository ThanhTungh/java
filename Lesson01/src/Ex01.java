import java.util.Scanner;
public class Ex01 {
	
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("number of n = ");
			int n = scanner.nextInt();
					
		int i = 0;
		
		//process
		
		int max = Integer.MIN_VALUE;
		while(i<n) { //ensure we can run n time
			
			int x= scanner.nextInt();
			if (x > max)
				max = x;
			i++;
			
		}
			//OutPut
		
		
		System.out.println("Max value is: " + max);
	}
}