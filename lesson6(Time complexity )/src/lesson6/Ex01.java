package lesson6;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int sum = n* (n+1)/2;
		/*
		 sum = 0	//1
		 i = 1		//1
		 i <= 1		//(n+1)
		 i++		//n
		 sum = sum +i //2n
		 log =  log2
		 */
	}
	
	long getOperationsCount(int n) {
		long counter = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				counter++;
		return counter;
	}
	/*
	 counter = 0  	//1
	 i = 0		  	//1
	 i < n		  	//n || n+ 1
	 i++			//n
	 j = 0			//n
	 j < n			//n * n || n* (n +1)
	 j++			//n * n
	 counter++		//n * n
	 return counter //1
	 
	 T(n) = 3n^2 + 3n + 3	|| T(n) = 3n^2 + 4n + 4
	 
	 // cau lẹnh counter++ la cau lenh thuc hien nhieu lan nhat tuong ung voi truong hop cac gia ri chi so cua vong lap
	  
	  i = 0: j chay tu 0 -> (n-1) : j chay n lan
	  i = 1							j chay n lan
	  .
	  .
	  i = n - 1						j chay n lan
	  
	  Cau lenh counter++ chay tong cong n * n lan 
	  => Time complexity ò getOperationsCount() is O(n^2)
	 */
	
	public boolean fun(int[] a, int item){
	    int j = 0;
//	    while (j < a.length && item != a[j])
//	        j++;
	    for(; j<a.length; j++) {
	    	if(a[j] == item)
	    		return true;
	    }
	    return false;
//	    return (j != a.length);
	}
	/*
	 Best case scenario of an algorithm(lower bound): so lan chay it nhat
	 
	 Worst case scenario of an algorithm(upper bound): so lan chay nhieu nhat
	 
	 Lower bound <= Averange-case <= Upper bound
	 Big-omega         Big Theta       Big-O
	 
	 COng thuc tinh averange case
	 
	 T(n) 
	 */
	
	public int fib(int n) {
	    if(n <= 2) return 1;
	    return fib(n-1) + fib(n-2);
	}
	/*
	 T(n) = T(n-1) + T(n-2) +c
	 	  <= 2T(n-1) +(2^1 - 1)c
	 	  <= 2^2 * T(n-2) +(2^2 - 1) * c
	 	  <= 2^3 * T(n-3) +(2^3 - 1) * c
	 	  	......
	 	  <= 2^(n-2) * T(n-(n-2)) +(2^(n-2)-1) *c
	 	  <= c *(2^(n-1) -1)
	 	  
	 T(n) >= (2^1) * T(n-2) +(2^1 - 1) *c
	 	  >= (2^2) * T(n-4) +(2^2 -1) *c
	 	  >= (2^3) * T(n-6) +(2^3 -1) *c
	 	  >= (2^4) * T(n-8) +(2^4 -1) *c
	 		......
	 	  >= 2^((n-2)/2) * T(n-(n-2)) +(2^((n-2)/2) -1) *c
	 	  >= c* (2^((n-2)/2 +1) -1 )
	 	
	 	=> Time complexity of fib() is O(2^n)
	 	
	 */
	private static int tinh(int start, int end) {
		if(start == end)
			return start;
		else
			return tinh(start, end-2)+ end;
	}
	/*
	 T(a,b)
	 n= b-a
	 T(n) = T(n-2) +c
	 		T(n-4) +2c
	 		T(n-6) +3c
	 		T(n-8) +4c
	 		
	 		T(0) + n/2 *c
	 		(n/2 +1) *c
	 => Time complexity of tinh() is O(n)
	 */
	
}
