/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ex09
{
	public static void main(String[] args) {
		//Print all prime number from 1 to n. <Design and use function properly>
		int n = 100;
		for(int k=1; k<=n; k++){
		    if(isPrime(k) == true){
		        System.out.print(k + " ");
		    }
		}
	}
	private static boolean isPrime(int x){
	    if(x < 2)
	        return false;
	    for(int i=2; i<x; i++){
	        if(x % i == 0)
	            return false;
	    }
	    return true;
	}
}