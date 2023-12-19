
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {9, 5, 10, 10, 15, 9, 10};
		int[] result = findMaxMin(arr);
		System.out.println("Maximum is: "+ arr[result[0]] + ", at index: "+ result[0]);
		System.out.println("Maximum is: "+ arr[result[1]] + ", at index: "+ result[1]);
	}

	//Three main components in the definition of a function
	/*
	 1.function's name: findMax(), FindMax(), ..
	 
	 2. List of parameter : tham so cua ham
	 3. gia tri tra ve cua output
	 */
	
	private static int[] findMaxMin(int[] x) {
		int idMax = 0;
		int idMin = 0;
		for(int i=1; i<x.length; i++) {
			if(x[idMax] < x[i]) {
				idMax = i;
			}
			if(x[idMin] > x[i]) {
				idMin = i;
			}
		}
//		System.out.println("Maximum is: "+ x[idMax] + ", at index: "+ idMax);
		return new int[] {idMax, idMin}; //gia tri tra ve
	}
	
}

