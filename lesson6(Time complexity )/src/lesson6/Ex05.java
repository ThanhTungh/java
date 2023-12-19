package lesson6;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30000;
		long[] mem = new long[n+1];
		fibM(n, mem);
		
		for(int i =1; i <= n; i++) {
			System.out.println(mem[i]);
		}
		
	}
	private static long fibM(int n, long[] mem) {
	    if(n <= 2) {
	    	mem[n] = 1;
	    }
	    else {
	    	if(mem[n] == 0)
	    		mem[n] = fibM(n-1, mem)+ fibM(n-2, mem);
	    }
	    return mem[n];
	}

}
