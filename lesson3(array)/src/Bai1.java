
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {9, 5, 10, 10, 15, 9, 10};
		int max = arr[0];
		int indexOfMax = 0;
		int min = arr[0];
		int indexOfMin = 0;
		for (int i =0; i< arr.length; i++) {
			if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
			if (min > arr[i]) {
                min = arr[i];
                indexOfMin = i;
            }
		}
		System.out.println("Maximum is: "+ max + ", at index: "+ indexOfMax);
		System.out.println("Minimum is: "+ min + ", at index: "+ indexOfMin);
	}

}
