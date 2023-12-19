/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ex08
{
	public static void main(String[] args) {
		//Given a random array, find the maximum value in the array and its index
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("The length of array to be created: ");
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		java.util.Random random = new java.util.Random();
		int idx_max = 0; //Store the index of maximum element
		for(int i=0; i<arr.length; i++){
		    arr[i] = random.nextInt(21);   //[0,20]
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
        int result = findMax(arr); //call the function findMax(), and pass argument to the function
        if(result != -1) //Continue if the function is finished
            System.out.println("Maximum value is: " + arr[result] + ", at index " + result);
	}
	//Function name: findMax
	//List of parameters (input of the function): an integer array brr[]
	//Return type (data type of the output): int
	    // Expected output: index of the maximum element
	
	private static int findMax(int brr[]){
	    int idx = 0;
	    for(int i=1; i<brr.length; i++){
	        if(brr[i]>brr[idx])
	            idx = i;
	    }
        return idx;
	}
}