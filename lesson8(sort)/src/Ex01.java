
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Input: an array of decimal data, named 'arr'
		 output: bu (clone of arr sorted)
		 	sorted : ASC, DESC
		 bu[], n = bu.length
		 
		 ASC: bu[i] <= bu[i+1]; i= (0, n-2)
		 DESC: bu[i] >= bu[i+1]; i = (0, n-2)
		 */
		int[]arr = {1,2,3,4,5,6};
		int n = arr.length;
		
		boolean asc = true;
		for(int i = 0; i <= n-2; i++) {
			if(arr[i]> arr[i+1]) {
				asc = false;
				break;
			}
		}
		System.out.print(asc);
	}

}
