package aaaa;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		//C1: Equation
		int sum = n*(n+1)/2;
		System.out.println("Sum = " +sum);
		//C2: Interation
		sum = tinh_tong(n);
		System.out.println("Sum = " +sum);
	}
	
	private static int tong(int n) {
		if(n==1)return 1;
		else
			return tong(n-1)+n;
	}
	
	private static int tinh_tong(int n) {
		int sum=0;
		for(int i = 1; i<=n; i++) {
			sum +=i;
		}
		return sum;
	}
	/*
	  sum=0		run 1 time
	  i=0		run 1 time
	  i <= n	run (n+1) times
	  i++		run n times
	  sum=sum+i	run n times
	 */
	
}
//Input space: it requires a space of N elements of type int
//		for the array 'arr' - 4 *N
//		and a variable N-4 bytes
//Auxiliary spave: two variables (i, sum) of type int - 8 bytes
//
//		Input space: 0(n)
//		Auxiliary space: 0(1)
//		Space complexity = 0(n) + 0(1) = 0(n)
//		
//		it takes a space of (4*N +12) bytes for  running the algorithm
//		Space Complexity: 0(n)