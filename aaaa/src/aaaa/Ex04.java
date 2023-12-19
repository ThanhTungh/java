package aaaa;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a & b, calculate sum of all even  numbers in [a,b] with 3 different solutions
	    int a=8 , b=20;
	    
	    int start = (a%2==0) ? a: (a+1);
	    int end = (b%2==0) ? b: (b-1);
	    int sum = (end+start) *((end-start)/2 +1)/2;
	    System.out.println("Sum  = " + sum);
	  //C3:
		start = (a%2==0) ?a:(a+1);
		sum = tong(start, b);
		System.out.println("Sum = " +sum);
	}
	private static int tong(int start, int b) {
		if(start>b)return 0;
		else tong(start +2, b) + start;
	}
	//C2: Equation
	private static int tinh_tong(int a, int b) {
		int sum = 0;
		int start = (a%2==0) ? a: (a+1);
		for(int i =start; i<=b; i+=2) {
			sum+=i;
		}
		return sum;
	}
	
}
