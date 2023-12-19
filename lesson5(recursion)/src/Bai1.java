
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7, 12, 5, 9, 4, 12};
		int n = arr.length - 1;
		int idxMax = findMaxMin(arr, 0, n);	
		int max = arr[idxMax];
		
		System.out.println("maximum value is " +max + ", at position " +idxMax);
	}
//	private static int findMax(int[]arr, int l, int r) {
////		if(l == r)
////			return r;
////		else {
////			int x = findMax(arr, l+1, r);
////			return (arr[l] > arr[x]) ? l :x;
////		}
//		if(l == r)
//			return l;
//		else {
//			int x = findMax(arr, l, r-1);
//			return (arr[r] >= arr[x]) ? r:x; //dau = lay phan tu 12 cuoi cung bo dau = thi lay 12 tai vi tri dau tien
//		}
//	}

	private static int findMaxMin(int[]arr, int l, int r) {
		if (l ==r)
			return new int[] {r, r};
		else {
			int[] x = findMaxMin(arr, l+1, r)
		}
	}
}
