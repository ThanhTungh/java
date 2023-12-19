
public class Ex02_C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 4, 7, 6, 0, 2, 1, 7};
		int n = arr.length; // n: so phan tu  hien thoi dang dung toi trong mang
		//length <=> capacity:tong so phan tu co the luu duoc trong mang
		//How to delete an element in the array
		
		
//		int idx = 1;//Vi tri cua phan tu ta muon xoa
//		n = remove(arr, idx, n);
		
		//How to delete all even element in array
		for(int i=0; i<n; i++) {
			if(arr[i]%2 == 0) {
				n = remove(arr, i, n);
				i--;
			}
		}
			//Output
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
	private static int remove(int[] arr, int idx, int n) {
		// TODO Auto-generated method stub
		for(int j=idx; j<n-1; j++) {
			arr[j] = arr[j+1];
		}
		n--;//Sau khi xoa xong giam so phan tu dang dung cua mang di 1 don vi
		return n;
	}

}
