
public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int
	}
	private static boolean search(int[] arr, int key, int l, int r) {
		if (l == r)
			return arr[r] == key;
		else {
			return (arr[l] == key)|| search (arr, key, l+1,r);
		}
	}
	private static boolean search(int[] arr, int key, int l, int r) {
		if (l == r)
			return (arr[r] == key) ? true: false;
		else {
			return (arr[l] == key)? true: search (arr, key, l+1,r);
		}
	}

}
