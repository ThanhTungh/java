/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ex07
{
	public static void main(String[] args) {
	    int arr[] = new int[10]; //You must define the length of the array once it is declared
       java.util.Random random = new java.util.Random();
       for(int i=0; i<arr.length; i++){
           arr[i] = random.nextInt(21); //[0,20]
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       //Process
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       int keyword = 0;
       do{
           System.out.print("Enter a number to be searched: ");
           keyword = scanner.nextInt();
           if(keyword!=-1){
               int i=0;
               for( ; i<arr.length && arr[i]!=keyword; i++);
               if(i==arr.length)
                    System.out.println("NOT Found");
                else
                    System.out.println("Found");
           }
       }while(keyword !=-1);
       
	}
}