
public class Ex02 {

	public static void main(String[] args) {
		int n = 70;
		long a = 1;
		long b = 1;
		long c = 0;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<n-2; i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
