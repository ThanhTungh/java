import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.print("number of x = ");
		int x = scanner.nextInt();	
		
		//Process + Output
		//C1
		double a = Math.sqrt(x);
		if(a%1==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		//C2
		System.out.println("------------");
		int b = (int) a;
		if(b*b == x)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//C3
		int i=1;
		while(i*i < x) {
			i++;
		}
		if(i*i==x)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
