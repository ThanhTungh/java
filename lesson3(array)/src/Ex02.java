import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		//generate random values for 'arr'
		Random rd = new Random();
		for(int i =0; i<arr.length; i++) {
			arr[i]= rd.nextInt(11) -1; //[0, 10]; 11: upper bound
//			arr[i] = rd.nextInt(-5, 16); //cai jdk17 de dung
//			arr[i] = rd.nextInt(21) ; //[-5, 15]: lower bound
		}
		System.out.println(Arrays.toString(arr));
	}

//	public class MyRandom extends Random{
//		
//	}
}
