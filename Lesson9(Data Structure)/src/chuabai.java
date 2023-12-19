import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class chuabai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		int n = arr.length;
		int count = 10;
		Random rd =new Random();
		for(int i=0; i< count; i++) {
			arr[i]= rd.nextInt(21);
		}
		
		ArrayList<Integer> aList = new ArrayList<> ();
		for(int i= 0; i<count; i++) {
			aList.add(rd.nextInt(21));
		}
		System.out.println(aList.size());
		aList.add(999);
		System.out.println(aList);
		
	}
	private static int add(int[] brr, int count, int data) {
		if(count < brr.length)
			brr[count++] = data;
		else {
			int[] crr = new int[brr.length*2];
			for(int i=0; i<brr.length; i++) {
				crr[i]= brr[i];
			}
			crr[count++] = data;
			brr= crr;
		}
		return count;
	}
	/*
	
	 */
}
