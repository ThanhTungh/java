/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ex05
{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter a = ");
		int a = scanner.nextInt();
		System.out.print("Enter b = ");
		int b = scanner.nextInt();
		//----------------- C1 -----------------
		int sum = 0;
		for(int i=a; i<=b; i++){ //Go to each number in [a,b]
		    if(i%2==0) //Even
		        sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		//----------------- C2 -----------------
		sum = 0;
// 		int k = a;
// 		if(a%2!=0)
// 		    k = a + 1;
		int k = (a%2==0) ? a : (a+1); //k is always an even number
		for(int i=k; i<=b; i+=2){ //Go to each number in [a,b]
		    sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		//----------------- C3 -----------------
		int start = (a%2==0) ? a : (a+1); 
		int end = (b%2==0) ? b : (b-1);
		
		int n = (end-start)/2 + 1;
		sum = (start + end) * n/2;
		
		System.out.println("Sum = " + sum);
	}
}