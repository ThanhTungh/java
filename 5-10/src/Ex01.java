
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
//		System.out.println(fib(n));
		long mem[] = new long[n+1];
		fib_mem(n, mem);
	}
	private static long fib_mem(int n, long[] mem) {
		if(n <= 2) {
			mem[1] =mem[2]= 1;
		}else{
			if(mem[n]==0)
				mem[n]=fib_mem(n-1, mem) + fib_mem(n-2, mem);
		}
		return mem[n];
		
		
	}
	private static long

}
