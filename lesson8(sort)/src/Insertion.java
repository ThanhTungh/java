import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13, 12, 11, 5, 6, 10, 12};
		int n = arr.length ;
		for(int i= 1; i < n; i++) {
			int key = arr[i];
//			for(int j = i-1; j >=0; j--){ 
//				if(key < arr[j]) {
//					arr[j+1]= arr[i];
//				}else{
//				arr[j+1]= key;
//				break;
//				}				
//			}
			 int j = i - 1;

	            while (j >= 0 && key < arr[j]) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;		
		}
		System.out.println(Arrays.toString(arr));	
	}
}
