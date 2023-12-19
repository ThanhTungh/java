/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ex06
{
	public static void main(String[] args) {
	    int arr[] = new int[10]; //You must define the length of the array once it is declared
	    //length of the array: the total number of elements can be stored in the array
	    //default value is 0

        //Access elements in the array by using index	    
        //Index: 0 -> length-1
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
       // System.out.println(arr[arr.length]); //Error
       
       //Input
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       java.util.Random random = new java.util.Random();
       for(int i=0; i<arr.length; i++){
           arr[i] = random.nextInt(21); //[0,20]
       }
       
       int brr[] = {5, 8, 0, 2, 10, 7};
       
       //Process
       
       //Output
       System.out.println("The inputed list is: ");
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
       }
	}
}