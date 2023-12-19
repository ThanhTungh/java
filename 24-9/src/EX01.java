import java.util.Random;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Mang la tap hop cac phan tu
		//2.Mang co nhung tinh chat gi
		//-cac phan tu cua mang co cung kieu du lieu
		//-khi tao mang can khai bao truoc kich thuoc cua mang
		//length: so phan tu toi da ma mang co the luu tru
		
		int arr[]; //Declaration statement
		arr = new int[20]; //Initialization: assign default values (0)
							//to all elements of the array
							//Length: 10 - Toi da mang co the luu dc 10 phan tu
		arr[0] = 5;
		System.out.println(arr[0]);
		//Each element of the array can be accessed via its index in the array
		//Index: 0->lenghth-1
		System.out.println(arr[9]);
		//Compile-time error vs Run-time error
		System.out.println(arr[10]);
		//->Error: ArrayIndexOutOfBoundException
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt()%21;
			arr[i] = random.nextInt(11 + 5 + 1) - 5;
		}
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		for(int each: arr){
			System.out.print(each + " ");
		}
		System.out.println();
		
//		String names[] = new String[10]; //default values: null
//		names[0] = new String("Hello World");
//		names[1] = "Good morning";
//		System.out.println(names[0]);
//		
//		String k = "";
//		String m;
//		System.out.println("Result = " + m);
//		
//		int x = 7; //Declaration & Initialization
//		System.out.println(x);
//		
//		int y; //Declaration
//		y = 7;
//		y = 2;
//		System.out.println(y);
	}

}
