
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {2,2,2,2,2,2,2};
		int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
    
	}
	public static int findThirdLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 1;
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
            if (count == 3) {
                temp =  arr[i - 1];
            }
        }
        return temp;
       
    }

}
